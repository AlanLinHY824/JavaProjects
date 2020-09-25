package demo1;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s);
        s.study();

        Person p=new Student();//多态，也就是向上转型

        System.out.println(p);

        //p.study;//study不能访问子类独有的实例方法

        //解决办法：向下转型

        if (p instanceof Student){
            ((Student)p).study();
        }

    }
}
