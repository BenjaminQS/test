package com.locale;

import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;

public class LocaleTest {
	/**
	 * get current locale
	 * @return current locale
	 */
	public static Locale getCurrentLocale(){
		return LocaleContextHolder.getLocale();
	}
	
	/**
	 * get current language
	 * @return language key
	 */
	public static String getCurrentLanguage(){
		Locale locale = getCurrentLocale();
		return getLanguage(locale);
	}
	
	/**
	 * get language
	 * @param locale language locale
	 * @return language key
	 */
	public static String getLanguage(Locale locale){
		if(locale == null){
			return null;
		}
		else{
			return locale.getLanguage();
		}
		
	}
	
	public static void main(String[] args){
		System.out.println(getCurrentLanguage());
	}

}
