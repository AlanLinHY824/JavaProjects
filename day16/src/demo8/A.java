package demo8;

/**
 * @AlanLin 2020/6/18
 */
public class A {
    int a=5;

    public void A1(){
        this.A2();
        System.out.println(this.a);
    }

     void A2(){
        System.out.println("A2方法");
    }

}
