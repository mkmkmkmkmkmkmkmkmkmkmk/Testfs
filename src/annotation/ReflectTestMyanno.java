package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-11-05_周五 00:11
 **/
@Myanno1(className = "annotation.Annotationdemo1",methodName = "show")
public class ReflectTestMyanno {
    public static void main(String[] args) throws Exception{
        /*解析注解*/
        Class<ReflectTestMyanno> reflectTestMyannoClass= ReflectTestMyanno.class;
        /*获取上面注解对象*/
         Myanno1 myanno1= reflectTestMyannoClass.getAnnotation(Myanno1.class);
         /*调用注解对象定义的抽象方法，获取返回值*/
        String className=myanno1.className();
        String methodName=myanno1.methodName();
        //System.out.println(className);
        //System.out.println(methodName);

        Class cls=Class.forName(className);
        /*两种创建对象的方法*/
        //方式一：类创建
        Object personObj1=cls.newInstance();
        Method method1=cls.getMethod(methodName,String.class);
        method1.invoke(personObj1,"魏宇");


    }
}
