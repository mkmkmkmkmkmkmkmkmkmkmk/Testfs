package annotation.caculator;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-11-04_周四 20:53
 **/
/*主方法执行，自动检测加了Check注释的方法，判断方法是否有异常，记录异常的文件中*/
public class TestCheck {

    public String timestamp(){
        Calendar now =Calendar.getInstance();
        //+"_"+now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)
        String str=now.get(Calendar.YEAR)+"-"+(now.get(Calendar.MONTH)+1)+"-"+now.get(Calendar.DATE);
        //System.out.println(now.get(Calendar.YEAR));
        return str;
    }

    public static void main(String[] args) throws IOException {
       /* 创建计算机对象*//*获取字节码文件对象*/
        Class caculatorClass= Caculator.class;
        Caculator caculator =new Caculator();
        TestCheck testCheck=new TestCheck();



        int num =0;/*定义出现异常的次数*/
        BufferedWriter bfw=new BufferedWriter(new FileWriter(testCheck.timestamp()+".txt"));
       /*获取所有的方法*/
       Method[] caculatorMethods= caculatorClass.getMethods();
        for (Method caculatorMethod:
                caculatorMethods) {
            /*判断caculator 的类上是否@Check有注解*/
            if(caculatorMethod.isAnnotationPresent(Check.class)) {
                try {
                    /**/
                    caculatorMethod.invoke(caculator);
                } catch (Exception e) {
                   /*捕获异常，记录到文件中*/
                    num++;
                    bfw.write("注释"+caculatorMethod.getAnnotation(Check.class)+"检测出"+caculatorMethod.getName()+"方法出异常了");
                    bfw.newLine();
                    /*getCause返回throwble对象 getSimpleName获取不带包名的类名*/
                    bfw.write("异常名称："+e.getCause().getClass().getSimpleName());
                    bfw.newLine();
                   /* 必须要写getCause()，不然获取不到异常原因*/
                    bfw.write("异常原因："+e.getCause().getMessage());
                    bfw.newLine();
                    bfw.write("----------------------");
                    bfw.newLine();
                }
            }
            }
        bfw.write("这次测试一共出现"+num+"次异常");
        bfw.flush();
        bfw.close();
        }
    }

