package demo2;

/**
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        Student s=new Student();
//        s.name="张三";
//        s.age=-1;
//        s.gender="X";
        //对象的属性可以随意赋值,不会报错，但实际上给的值无意义
        //解决办法：在赋值前先进行判断，如果合法则可以赋值，不合法就不赋值，使用“封装”完成，这样数据更加安全
    }
}
