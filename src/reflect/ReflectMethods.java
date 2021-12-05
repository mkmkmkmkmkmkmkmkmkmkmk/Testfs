package reflect;

import java.lang.reflect.Method;

public class ReflectMethods {
    public static void main(String[] args) throws Exception {
        Class personClass=Person.class;
        Person person=new Person();
        Method personMethod=personClass.getMethod("stop");
        personMethod.invoke(person);

        Method personMethod1=personClass.getMethod("stop",String.class);
        personMethod1.invoke(person,"斯宇");

        /*不仅有Person类中的方法，也有Object类中的方法*/
        Method[] methods=personClass.getMethods();
        for (Method personmethod:
             methods) {
            //System.out.println(personmethod);
            System.out.println(personmethod.getName());

        }

        /*获取类名*/
       String className=personClass.getName();
       //System.out.println(className);//包名.类名
    }
}
