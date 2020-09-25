package custom;

/**
 * @AlanLin 2020/7/11
 */
public class Factory extends Thread{
    Store store;

    public Factory(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
//        for (int i = 0; i <10 ; i++) {
//            store.put();
//            //System.out.println(i+"次放入");
//        }
        store.put();
    }
}
