package annotation.caculator;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-11-04_周四 20:47
 **/
public class Caculator {
    @Check
    public void add(){
        String str=null;
        str.toString();
        System.out.println("1+0="+(1+0));
    }
    @Check
    public void sub(){
        System.out.println("1-0="+(1-0));
    }
    @Check
    public void mul(){
        System.out.println("1x0="+(1*0));
    }
    @Check
    public void div(){
        System.out.println("1/0="+(1/0));
    }


}
