package demo8;

/**
 * @AlanLin 2020/6/18
 */
public class B extends A{
    int a=10;

//    public void A2() {
//        System.out.println("重写后的A2方法");
//    }
    public void A3(){
        A2();//可以访问A2是因为在同一个包中
    }
}
