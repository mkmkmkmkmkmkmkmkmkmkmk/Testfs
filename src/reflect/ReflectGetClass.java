package reflect;

import java.lang.reflect.Constructor;


public class ReflectGetClass {
    public static void main(String[] args) throws Exception{
        /*Class.forName("全类名")*/
        Class cls1=Class.forName("reflect.Person");
        //System.out.println(cls1);//class reflect.Person

        /*类名.class */
         Class cls2=Person.class;
        //System.out.println(cls2);//class reflect.Person

        /*对象.getclass() */
        Constructor constructor=cls2.getConstructor();
        Object personobj=constructor.newInstance();
        Class cls3= personobj.getClass();
        //System.out.println(cls3);//class reflect.Person

        /*比较三个class是否相同*/
        //System.out.println(cls1==cls2);//true
        //System.out.println(cls2==cls3);//true


    }
}
