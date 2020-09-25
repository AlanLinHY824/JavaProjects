package custom3;

/**
 * @AlanLin 2020/7/11
 */
public class Customer extends Thread {
    Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
//        for (int i = 0; i <10 ; i++) {
//            store.get();
//            //System.out.println(i+"次取出");
//        }
        store.get();
    }
}
