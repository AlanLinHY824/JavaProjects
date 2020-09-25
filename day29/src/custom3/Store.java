package custom3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @AlanLin 2020/7/11
 */
public class Store {
    Integer num=0;//商品数量

    //synchronized
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();

    public void get(){
        synchronized(num){
            num--;
            System.out.println("商品已售出，数量为："+num);
            try {
                Thread.sleep(2000);
                System.out.println("售出结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //notify();
        //condition.signal();
    }

    public void put(){
//        if (num>0){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        num=Integer.valueOf("122");
        System.out.println("商品已放入，数量为："+num);
        //notify();
    }

}
