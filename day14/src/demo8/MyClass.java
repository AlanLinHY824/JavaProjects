package demo8;

/**
 * @AlanLin 2020/6/16
 */
public class MyClass {
    int x=0;
    static int y=10;
    {
        x=20;
        y=30;
        int u=50;
        System.out.println("父类实例代码块执行");
    }

    static {
        y=40;
        int z=0;
        System.out.println("父类静态代码块执行");
    }

    public MyClass(int x) {
        this();
        this.x = x;
        System.out.println("父类带参构造方法执行");
    }

    public MyClass() {
        System.out.println("父类无参构造方法执行");
    }
}
