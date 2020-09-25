package demo5;

/**
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        /*
            当创建MyClass对象时
            1、先将MyClass类加载到内存中
            2、然后在方法区中给静态变量y和z分配空间，并且y的值为100，z的值默认为0
            3、然后执行静态代码块，将z赋值为200
            4、然后在堆内存中创建一个对象，并为实例对象x开辟存储空间，默认值为0
            5、同时执行带一个参数的构造方法
            6、将右侧对象的内存地址赋值给左侧的对象名mc
         */

        MyClass mc=new MyClass(123456);
        MyClass mc2=new MyClass();
    }
}
