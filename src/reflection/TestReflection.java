package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

	// @SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			Class<?> clazz = Class.forName("reflection.Hero");
			System.out.println(clazz.getName());
			Field[] fs = clazz.getFields();
			System.out.println(fs.length);
			Field[] dfs = clazz.getDeclaredFields();
			System.out.println(dfs.length);
			for(Field temp:dfs){
				System.out.println(temp);
			}
			Method[] methods = clazz.getDeclaredMethods();
			
			Hero h = (Hero) clazz.newInstance();
			
			Method m1 = clazz.getDeclaredMethod("setName", String.class);
			m1.invoke(h, "ZhangSan");
			
			Method m2 = clazz.getDeclaredMethod("getName", null);
			
			System.out.println(m2.invoke(h));
			
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	private static Object getFieldValueByName(String fieldName, Object o){      
	   try   
	   {      
	       String firstLetter = fieldName.substring(0, 1).toUpperCase();      
	       String getter = "get" + firstLetter + fieldName.substring(1);      
	       Method method = o.getClass().getMethod(getter, new Class[] {});      
	       Object value = method.invoke(o, new Object[] {});      
	       return value;      
	   } catch (Exception e)   
	   {      
	       System.out.println("属性不存在");      
	       return null;      
	   }      
	}    
}