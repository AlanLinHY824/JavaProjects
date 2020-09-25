package demo4;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        final int b;
        b=20;
        //b=30;

        final Student s=new Student();

        //s=new Student(); s为常量，不能更改其中存放的对象

        s.name="张三";//但是可以更改其中的属性，因为属性并不是常量




    }
}
