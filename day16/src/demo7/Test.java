package demo7;


/**
 * @AlanLin 2020/6/17
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Student();//构成多态，也就是向上转型
        System.out.println(p.age);
        System.out.println(p.gender);
        System.out.println(p.name);
        System.out.println(((Student) p).stuId);//向下转型
    }
}
