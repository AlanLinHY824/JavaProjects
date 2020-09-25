package instanceoftest;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        //A为父类，B为子类
        A a1=new B();
        A a2=new A();
        B b1=new B();
        B b2=new C();
        C c1=new C();
        System.out.println(a1 instanceof B);//true
        System.out.println(a1 instanceof A);//true
        System.out.println(a2 instanceof B);//false
        System.out.println(a2 instanceof A);//true
        System.out.println(b1 instanceof A);//true
        System.out.println(b1 instanceof B);//true
        System.out.println(b2 instanceof A);//true
        System.out.println(b2 instanceof B);//true
        System.out.println(b2 instanceof C);//true
        System.out.println(c1 instanceof A);//true
        System.out.println(c1 instanceof B);//true
    }
}
