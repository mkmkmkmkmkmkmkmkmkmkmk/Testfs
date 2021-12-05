package reflect;


import java.util.List;

public class Person{
    private int id;
    private String name;
    public String sb;
    protected String so;
     List<String> xueh;
    public Person() {

    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;

    }
    public Person(int id, String name, String sb, String so, List<String> xueh) {
        this.id = id;
        this.name = name;
        this.sb = sb;
        this.so = so;
        this.xueh = xueh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sb='" + sb + '\'' +
                ", so='" + so + '\'' +
                ", xueh=" + xueh +
                '}';
    }
    public void stop(){
        System.out.println("人停下来");
    }
    public void stop(String name){
        System.out.println(name+"停下来");
    }
    @Deprecated
    public void stop(int id,String name){
        System.out.println("第"+id+"个"+name+"停下来");
    }

}

