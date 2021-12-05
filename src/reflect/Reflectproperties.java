package reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflectproperties {
    public static void main(String[] args) throws Exception {
        /*
        *前提:不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
         */
        Properties properties=new Properties();
        ClassLoader classLoader= Person.class.getClassLoader();
        InputStream ins=classLoader.getResourceAsStream("reflect.properties");
        properties.load(ins);

        String className= properties.getProperty("className");
        String methodName= properties.getProperty("methodName");

        Class cls=Class.forName(className);
        /*两种创建对象的方法*/
        //方式一：类创建
        Object personObj1=cls.newInstance();
        Method method1=cls.getMethod(methodName,String.class);
        method1.invoke(personObj1,"魏宇");


        //方式二：构造器创建
        //Constructor constructor=cls.getConstructor();
        //Object personobj=constructor.newInstance();
        //Method method=cls.getMethod(methodName,int.class,String.class);
        // method.invoke(personobj,11,"唐佳悦");



    }
}
