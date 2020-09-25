package demo4;

/**
 * @AlanLin 2020/6/20
 */
public class SE extends Object implements ICode,IBusiness {
    static int i=1;
    @Override
    public void speak() {
        System.out.println("讲业务");
    }

    @Override
    public void code() {
        System.out.println("会编程");
    }

    @Override
    public void A1() {
//        i=i+1;
//        if (i==10){
//            return;
//        }
        System.out.println("重写的A1");
//        SE se=new SE();
//        se.A1();
    }


}
