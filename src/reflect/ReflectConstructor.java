package reflect;

import java.lang.reflect.Constructor;

public class ReflectConstructor {
    public static void main(String[] args) throws Exception  {

        Class personClass= Person.class;
        /*获取一个有参数构造器*/
        Constructor constructor= personClass.getConstructor(int.class,String.class);
        //System.out.println(constructor);
        //获取构造器(Constructor)用来创建对象（可以空参，也可以有参数）
        Object person=constructor.newInstance(12,"唐佳悦");
        //System.out.println(person); //Person{id=12, name='唐佳悦', sb='null', so='null', xueh=null}
        //Class来创建对象（只能空参构造方法）
        Object person2=personClass.newInstance();
        //System.out.println(person2);

        /*获取多个有参数构造器*/
        Constructor[] constructors=personClass.getConstructors();
        for (Constructor con:constructors) {
            System.out.println(constructors);
        }


    }
}
