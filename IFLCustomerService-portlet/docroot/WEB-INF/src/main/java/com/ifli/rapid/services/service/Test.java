package com.ifli.rapid.services.service;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		int id=5;
		Date utilDate=new Date();
		Calendar cal = Calendar.getInstance();
	   // cal.setTime("Mon Nov 11 00:00:00 GMT 2013");
	   // cal.
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
		//System.out.println(year+" : "+month+" : "+day);
		//Test.calculateMyAge(1987, 9, 21);
	   // Test.convertsqlDatetoNormalDate();
	    Test.convertStringToDate("21-08-1988");
		
		/*System.out.println(utilDate.getTime());
		java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
		java.sql.Timestamp t = new Timestamp(utilDate.getTime());
		//System.out.println(String.valueOf(id));
		System.out.println(utilDate);
		System.out.println(sqlDate);
		System.out.println(t);*/
		
	/*	java.util.Calendar cal = Calendar.getInstance();
		java.util.Date utilDate = new java.util.Date(); // your util date
		cal.setTime(utilDate);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);    
		java.sql.Date sqlDate = new java.sql.Date(cal.getTime().getTime()); // your sql date
		System.out.println("utilDate:" + utilDate);
		System.out.println("sqlDate:" + sqlDate);*/
	}

	private static int calculateMyAge(int year, int month, int day) {
		Calendar birthCal = new GregorianCalendar(year, month, day);
		 
		Calendar nowCal = new GregorianCalendar();
		 
		int age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
		 
		boolean isMonthGreater = birthCal.get(Calendar.MONTH) >= nowCal
		.get(Calendar.MONTH);
		 
		boolean isMonthSameButDayGreater = birthCal.get(Calendar.MONTH) == nowCal.get(Calendar.MONTH)
		&& birthCal.get(Calendar.DAY_OF_MONTH) > nowCal.get(Calendar.DAY_OF_MONTH);
		 
		if (isMonthGreater || isMonthSameButDayGreater) {
		age=age;
		}
		System.out.println("age : "+age);
		return age;
		}
	
	
	public static void convertsqlDatetoNormalDate() throws ParseException{
		Date d=new Date();
		SimpleDateFormat sf=new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-YYYY");
		
		String s=df.format(d);
		
		Date newDate=df.parse(s);
		
		/*Date d=new Date();
		SimpleDateFormat df=new SimpleDateFormat("dd-MM-YYYY");
		String s=df.format(d);*/
		/* Date date;
				date = new SimpleDateFormat("yyyy-MM-dd").parse("2014-02-07");
				String dateString2 = new SimpleDateFormat("dd-MM-yyyy").format(date);
				
				Date newDate = new SimpleDateFormat("dd-MM-yyyy").parse(dateString2);
				
		
				
		
		System.out.println(newDate.getDate()+"-"+(newDate.getMonth()+1)+"-"+newDate.getYear());*/
		
		System.out.println(s);
	}
	
	
	
	
	public static Date convertStringToDate(String date)  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date df;
        try {
               boolean check = false;
               try {
                     df = sdf.parse(date);
                     SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
                     java.sql.Date df1 = java.sql.Date.valueOf(sdf1.format(df));
                     System.out.println(df1);
                     return df1;
               } catch (ParseException e) {
                    System.out.println("IndiaMoneyUtil.convertStringToDate()");
                     check = true;
               }
               if (check) {
                     DateFormat sdf1 = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
                     java.util.Date df2;
                     df2 = sdf1.parse(date);
                     SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                     java.sql.Date df3 = java.sql.Date.valueOf(sdf3.format(df2));
                     return df3;
               }

        } catch (ParseException e) {
               
        }
        return null;

 }

 /**
  * Convert date to string.
  *
  * @param date the date
  * @return the string
  * @throws IMException the IM exception
  */
 public static String convertDateToString(Date date) {

        DateFormat formatter;

        formatter = new SimpleDateFormat("dd-MM-yyyy");
        formatter.format(date);
        String df1 = formatter.format(date);

        return df1;
 }

}
