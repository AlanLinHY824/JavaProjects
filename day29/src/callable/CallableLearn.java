package callable;

import custom.Customer;
import custom.Store;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @AlanLin 2020/7/11
 */
public class CallableLearn implements Callable<Long> {
    @Override
    public Long call() throws Exception {
        System.out.println("文件下载");
        Thread.sleep(3000);
        System.out.println("文件下载完成");
        return 1000*1024L;
    }

    public static void main(String[] args) {
        FutureTask<Long> futureTask=new FutureTask<Long>(new CallableLearn());//把callable对象转换为runnable对象，重写callable中的call方法，相当于runnable中的run方法
        Thread thread=new Thread(futureTask);
        Thread cu=new Customer(new Store());
        thread.start();
        //cu.start();
        try {
            System.out.println(futureTask.get());//是main方法所在线程，与thread同步执行，等待thread线程的结果返回后主线程才会向下执行
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        //cu.start();
        System.out.println("测试");
        System.out.println("测试");
        System.out.println("测试");
        System.out.println("测试");
        System.out.println("测试");
        System.out.println("测试");
        System.out.println("测试");
        System.out.println("测试");


    }



}
