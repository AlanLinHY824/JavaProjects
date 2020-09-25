package demo8;

/**
 * @AlanLin 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        A b=new B();
        A a1=new A();
        B b1=new B();
        ((B) b).A2();
        System.out.println(b.a);
        System.out.println(b instanceof B);
        System.out.println(a1 instanceof B);
        System.out.println(b1 instanceof B);
        System.out.println(b1 instanceof A);
    }
}
