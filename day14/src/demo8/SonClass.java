package demo8;

/**
 * @AlanLin 2020/6/16
 */
public class SonClass extends MyClass {
    int a=0;
    static int b=6;

    {
        System.out.println("子类实例代码块");
        a=40;
    }

    static {
        System.out.println("子类静态代码块");
    }

    public SonClass(int x, int a) {
        super(x);
        System.out.println("子类带参构造方法执行"+"a="+a);
        this.a = a;
        System.out.println("a="+a);
    }

    public SonClass(int x) {
        super(x);
        System.out.println("子类带参构造方法执行");
        System.out.println("x="+super.x);
    }

    public SonClass() {
        System.out.println("子类无参构造方法执行");
    }

}
