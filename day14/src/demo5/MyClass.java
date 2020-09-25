package demo5;

/**
 * static关键字修饰代码块
 * 静态代码块语法格式：
 *      static{
 *
 *      }
 * 静态代码块作用：完成对静态变量的赋值
 * 静态代码块什么时候执行：
 *      当类加载时，静态代码块执行,并且仅执行一次
 * @AlanLin 2020/6/16
 */
public class MyClass {
    static {
        z=200;
        System.out.println("执行静态代码块");
    }
    {
        System.out.println("执行实例代码块");
        System.out.println(z);
    }
    int x;
    static int y=100;
    static int z;


    public MyClass() {
        System.out.println("执行了无参构造");
    }

    public MyClass(int x) {
        this.x = x;
        System.out.println("执行了带一个参数的构造方法");
    }
}
