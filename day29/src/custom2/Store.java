package custom2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @AlanLin 2020/7/11
 */
public class Store {
    int num;//商品数量

    //synchronized
    Lock lock=new ReentrantLock();
    Condition condition=lock.newCondition();

    public void get(){
        lock.lock();
        if (num<=0){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("商品已取走，剩余数量是:" + num + ",请生产");
        //notify();
        condition.signal();
        lock.unlock();
    }

    public synchronized void put(){
        lock.lock();
        if (num>0){
            try {
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("商品已放入，数量为："+num);
        //notify();
        condition.signal();
        lock.unlock();
    }

}
