package custom3;

/**
 * @AlanLin 2020/7/11
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Store store=new Store();


        //Thread.sleep(2000);
            Thread factory=new Factory(store);
            //Thread factory2=new Factory(store);
            Thread customer=new Customer(store);
            customer.start();
            Thread.sleep(500);
            factory.start();








    }
}
