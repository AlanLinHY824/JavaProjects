package custom;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @AlanLin 2020/7/11
 */
public class Store {
    Integer num=1;//商品数量

    //synchronized
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();

    public synchronized void get(){
        System.out.println("购买执行");
        //lock.lock();
        if (num<=0){
            try {
                wait();
                //condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("商品已售出，数量为："+num);
        //notify();
        //condition.signal();
    }

    public synchronized void back(){
        System.out.println("退货执行");
        //lock.lock();
        if (num<=0){
            try {
                wait();
                //condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("商品已退货，数量为："+num);
        //notify();
        //condition.signal();
    }



    public synchronized void put(){
        if (num>0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("商品已放入，数量为："+num);
        notify();
    }

}
