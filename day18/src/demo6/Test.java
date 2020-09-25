package demo6;

/**
 * @AlanLin 2020/6/21
 */
public class Test {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        MyClass.Inner inner=myClass.new Inner();
        myClass.i=inner;
        MyClass.Inner2.print();
        MyClass.Inner2 inner2=new MyClass.Inner2();
        System.out.println(inner);
        System.out.println(inner2);
        inner2.print2();
        System.out.println(new MyClass.Inner2());
        MyClass2 myClass2=new MyClass2();

    }
}
