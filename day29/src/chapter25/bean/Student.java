package chapter25.bean;

/**
 * 反射Field
 * @AlanLin 2020/7/15
 */
public class Student {
    public static int no;
    private String name;
    protected  int age;
    boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
