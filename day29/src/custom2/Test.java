package custom2;

/**
 * @AlanLin 2020/7/11
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Store store=new Store();
        Thread factory=new Factory(store);
        //Thread factory2=new Factory(store);
        Thread customer=new Customer(store);

//        //Thread.sleep(2000);
//        for (int i = 0; i <100 ; i++) {
//            Thread factory=new Factory(store);
//            //Thread factory2=new Factory(store);
//            Thread customer=new Customer(store);
//            customer.start();
//            factory.start();
//        }
        customer.start();
        factory.start();
    }
}
