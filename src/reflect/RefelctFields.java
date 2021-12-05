package reflect;

import java.lang.reflect.Field;

public class RefelctFields {
    public static void main(String[] args) throws Exception {
        Class personClass=Person.class;
        /*获取Person的class对象只能获取public修饰的*/
        Field[] fileds=personClass.getFields();
        //System.out.println(fileds);
        for(Field f:fileds){
            System.out.println(f);
        }

        /*获取Person的某个public成员*/
        Field sb=personClass.getField("sb");
        Person p=new Person();
        //获取Person 类中public 变量的值
        Object sbvalue=sb.get(p);
        //System.out.println(sbvalue);
        // 设置Person 类中public 变量的值
        sb.set(p,"魏宇");
        //System.out.println(p);


    }
}
