package Thread;

/**
 * 合理终止线程的方法
 * @AlanLin 2020/7/13
 */
public class StopThread {
    public static void main(String[] args) {
        MyThread4 r=new MyThread4();
        Thread thread=new Thread(r);
        thread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run=false;
    }
}

class MyThread4 implements Runnable{
    boolean run =true;//标记线程的执行

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (run){
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //此处可以编写退出线程前需要执行的操作
                return;
            }
        }
    }
}