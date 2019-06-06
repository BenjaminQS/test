package com.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Test {
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
//		Date date = new Date();
//		System.out.println(date.getTime());
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		
//		Date d = new Date(1000);
//		
//		System.out.println(d.getTime());
//		
//		DateFormat df = new SimpleDateFormat("yy-mm-dd");
//		Date d2 = new Date();
//		String dfs = df.format(d2);
//		System.out.println(dfs);
//		
//		String str = "1990-02-01";
//		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date d3 = df2.parse(str);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		
//		Calendar c = new GregorianCalendar(2001, 10, 21, 12, 20, 10);
//		Date  d4 = c.getTime();
//		TimeZone s3 = c.getTimeZone();
//		System.out.println(s3.get);
		
		
//		String utcTime = "2018-01-31T14:32:19Z";
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//		//设置时区UTC
//		df.setTimeZone(TimeZone.getTimeZone("Indian/Reunion"));
//		//格式化，转当地时区时间
//		String[] ids = TimeZone.getAvailableIDs();
//		for(int i = 0; i < ids.length; i++){
//			System.out.println(ids[i]);
//		}
		
		
//		System.out.println(getEpochMilliFromTZString("2018-01-31T14:32:19Z"));
//		
//		
//		Date after;
//		try {
//			after = df.parse(utcTime);
//			System.out.println(after);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Wed Jan 31 22:32:19 GMT+08:00 2018
		
		
//		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
//		Date d = new Date();
//		df1.format(d);
//		System.out.println(	df1.format(d));
		
		
		        Date date = new Date(1000L); // 2014-1-31 21:20:50    
		        String dateStr = "2014-1-31 21:20:50 ";    
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    
		        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));    
		        try {    
		            Date dateTmp = dateFormat.parse(dateStr);    
		            System.out.println(dateTmp);    
		         } catch (ParseException e) {    
		            e.printStackTrace();    
		        }    
		        String dateStrTmp = dateFormat.format(date);    
		        System.out.println(dateStrTmp);    
		     
	}
	
	
	
	public static long getEpochMilliFromTZString(String tzString){
		return Instant.parse( tzString ).toEpochMilli();
	}

}
