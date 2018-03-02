package reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;
 
public class TestReflection {
 
//    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {
 
        //从spring.txt中获取类名称和方法名称
       File springConfigFile = new File("C:\\Users\\I324402\\workspace\\Test\\src\\spring.txt");
       Properties springConfig =  new Properties();
       springConfig.load(new FileInputStream(springConfigFile));
       String className = (String) springConfig.get("class");
       String methodName = (String) springConfig.get("method");
       Class clas = Class.forName(className);
       Method  m = clas.getMethod(methodName);
       Constructor c = clas.getConstructor();
       Object service = c.newInstance();
       System.out.println(m.getReturnType());
       m.invoke(service, null);
         
    }
}