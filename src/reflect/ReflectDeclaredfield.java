package reflect;

import java.lang.reflect.Field;

/* * Field[] getDeclaredFields()
 * Field getDeclaredField(String name)
 * */
public class ReflectDeclaredfield {
    public static void main(String[] args) throws Exception {
        Class personclass= Person.class;
        /*获取多个成员变量不考虑修饰符*/
        Field[] declaredFields=personclass.getDeclaredFields();
        for(Field f: declaredFields){
            System.out.println(f);
        }
        /*获取某个私有成员变量*/
        Field id=personclass.getDeclaredField("id");
        //忽略访问权限修饰符安全检查（暴力反射）
        id.setAccessible(true);
        Person p=new Person();
        Object value=id.get(p);
        //System.out.println(value);

    }



}
