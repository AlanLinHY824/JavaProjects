package demo6;

/**
 * static关键字修饰内部类
 * 1、什么是内部类
 *      在一个类中再编写一个类，里面的类称为内部类，也叫作内置类或者嵌套类
 * 2、什么时候使用内部类
 *  当一个大的数据结构中包含若干个小的数据结构，则这些小的数据结构就可以编写为内部类
 *      比如：电脑中包含风扇、主板、内存、硬盘。。。
 *  注意：一般内部类是对外部类提供服务的，如果还想对其他外部类提供服务，则不建议编写内部类
 * 3、static关键字修饰的内部类叫做静态内部类
 *
 *
 * @AlanLin 2020/6/16
 */
public class MyClass {
    public void print(){
        Inner i=new Inner();
    }
    class Inner{//内部类，一般在外部类的实例方法中使用

    }
    public static void show(){
        Inner2 i=new Inner2();
    }
    static class Inner2{//静态内部类，一般在外部类的静态方法中使用

    }
}
