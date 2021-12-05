package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-11-04_周四 14:31
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Myanno1 {
    String className();
    String methodName();
}
/*本质上是
public class Myanno1Imp implements Myanno1{
    String className(){ return "annotation.Annotationdemo1"};
    String methodName(){return "show"}
}*/
