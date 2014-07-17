package com.ifli.rapid.services.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CommonUtils {
	
	public static String changeDateFormat(String oldDate) throws ParseException{
		
		SimpleDateFormat originalFormat=new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat newformat=new SimpleDateFormat("dd-mm-yyyy");
		
		return newformat.format(originalFormat.parse(oldDate));
	}
	
	
	public static String changeDateTimeToFormat(Date oldDate) throws ParseException{
		
		
		
	//	SimpleDateFormat originalFormat=new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat newformat=new SimpleDateFormat("dd-MM-yyyy");
		
		return newformat.format(oldDate);
	}
	
	public static int calculateAgeFromDateofBirth(Date dob){
		int age=0;
		Calendar cal = Calendar.getInstance();
	    cal.setTime(dob);
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
		
	    Calendar birthCal = new GregorianCalendar(year, month, day);
		 
		Calendar nowCal = new GregorianCalendar();
		 
		age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
		 
		boolean isMonthGreater = birthCal.get(Calendar.MONTH) >= nowCal.get(Calendar.MONTH);
		 
		boolean isMonthSameButDayGreater = birthCal.get(Calendar.MONTH) == nowCal.get(Calendar.MONTH)
		&& birthCal.get(Calendar.DAY_OF_MONTH) > nowCal.get(Calendar.DAY_OF_MONTH);
		 
		if (isMonthGreater || isMonthSameButDayGreater) {
		age=age;
		}
		return age;
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

}
