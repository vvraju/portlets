package com.ifli.rapid.services.util;

import com.ifli.rapid.services.helper.beans.PolicyYears;
import com.ifli.rapid.services.helper.beans.UnitStatementBean;
import com.liferay.util.portlet.PortletProps;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PolicyUtil {

	
	private static final String DB_DRIVER = PortletProps.get("jdbc.unit.driverClassName");
	private static final String DB_CONNECTION = PortletProps.get("jdbc.unit.url");
	private static final String DB_USER = PortletProps.get("jdbc.unit.username");
	private static final String DB_PASSWORD = PortletProps.get("jdbc.unit.password");
 
	public static List<String> getYears(String polyear)
	{
		List<String> years=new ArrayList<String>();
		//String tempdate="2010-01-06 00:00:00.000";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
	
		Calendar cal=Calendar.getInstance();
		int curryear=cal.get(Calendar.YEAR);
		int j=0;
		try {
			Date d=df.parse(polyear.toString());
			//Date d=df.parse(tempdate);
			cal.setTime(d);
			int mon=cal.get(Calendar.MONTH);
			int yer=cal.get(Calendar.YEAR);
			if(mon <= 2)
			{
				cal.set(Calendar.YEAR, yer-1);
			}
			j=cal.get(Calendar.YEAR);
			for(;j<=curryear;j++)
			{
				years.add(""+j);
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return years;
	}
	public static List<PolicyYears> getYearsVales(String polyear)
	{
		List<PolicyYears> years=new ArrayList<PolicyYears>();
		//String tempdate="2010-01-06 00:00:00.000";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		
		Calendar cal=Calendar.getInstance();
		int curryear=cal.get(Calendar.YEAR);
		int j=0;
		try {
			Date d=df.parse(polyear.toString());
			//Date d=df.parse(tempdate);
			cal.setTime(d);
			int mon=cal.get(Calendar.MONTH);
			int yer=cal.get(Calendar.YEAR);
			if(mon <= 2)
			{
				cal.set(Calendar.YEAR, yer-1);
			}
			j=cal.get(Calendar.YEAR);
			for(;j<=curryear;j++)
			{
				PolicyYears py=new PolicyYears();
				py.setId(j);
				py.setVal(""+j);
				years.add(py);
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return years;
	}
	
	public static List<PolicyYears> getFinancialYearsVales(String polyear)
	{
		List<PolicyYears> years=new ArrayList<PolicyYears>();
		//String tempdate="2010-01-06 00:00:00.000";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		System.out.println("=== Policy Year ======="+polyear);
		Calendar cal=Calendar.getInstance();
		int curryear=cal.get(Calendar.YEAR);
		int j=0;
		try {
			Date d=df.parse(polyear.toString());
			//Date d=df.parse(tempdate);
			cal.setTime(d);
			int mon=cal.get(Calendar.MONTH);
			int yer=cal.get(Calendar.YEAR);
			if(mon <= 2)
			{
				cal.set(Calendar.YEAR, yer-1);
			}
			j=cal.get(Calendar.YEAR);
			for(;j<=curryear;j++)
			{
				PolicyYears py=new PolicyYears();
				py.setId(j);
				py.setVal(j+"-"+(j+1));
				years.add(py);
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return years;
	}
	
	public static List<UnitStatementBean> getUnitStmtByPolicyid(String polid,String fdate,String tdate)
	{
		List<UnitStatementBean> ulist=new ArrayList<UnitStatementBean>();
		try {
			callStoredProcINParameter(polid, fdate, tdate);
		} catch (SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ulist;
	}
	

	private static List<UnitStatementBean> callStoredProcINParameter(String polid,String fdate,String tdate) throws SQLException, ParseException {
		 
		List<UnitStatementBean> ulist=new ArrayList<UnitStatementBean>();
		Connection dbConnection = null;
		CallableStatement callableStatement = null;
 
		//String insertStoreProc = "{call MIS_UNITSTATEMENT()}";
		String insertStoreProc = "{call MIS_UNIT_STATEMENT(?)}";
 
		try {
			dbConnection = getDBConnection();
			callableStatement = dbConnection.prepareCall(insertStoreProc);
			String d=fdate;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date utilFromdate = sdf.parse(d);
			java.sql.Date sqlFromDate = new java.sql.Date(utilFromdate.getTime());
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date utilTodate = sdf1.parse(d);      
			java.sql.Date sqlToDate = new java.sql.Date(utilTodate.getTime());			
			
			callableStatement.setString("contractNo", polid);
		/*callableStatement.setDate("dateFrom",sqlFromDate );
			callableStatement.setDate("dateTo", sqlToDate);*/
 
			// execute insertDBUSER store procedure
			ResultSet rs=callableStatement.executeQuery();
			
			while(rs.next())
				{
				UnitStatementBean bean=new UnitStatementBean();
				bean.setAssigne(rs.getString(1));
				bean.setClntNum(rs.getString(2));
				bean.setContractNo(rs.getString(3));
				bean.setCurrency(rs.getString(4));
				ulist.add(bean);
				bean=null;
			}
 
			
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		} finally {
 
			if (callableStatement != null) {
				callableStatement.close();
			}
 
			if (dbConnection != null) {
				dbConnection.close();
			}
 
		}
		return ulist;
	}
	 
	private static Connection getDBConnection() {
 
		Connection dbConnection = null;
 
		try {
 
			Class.forName(DB_DRIVER);
 
		} catch (ClassNotFoundException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		try {
			
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;
 
		} catch (SQLException e) {
 
			System.out.println(e.getMessage());
 
		}
 
		return dbConnection;
 
	}
	
}
