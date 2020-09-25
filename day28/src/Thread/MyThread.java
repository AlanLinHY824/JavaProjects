package Thread;

/**
 * @AlanLin 2020/7/10
 */
public class MyThread extends Thread{
    String s;
    int sleepTime;
    @Override
    public void run() {
        System.out.println("开始"+s);
        try {
            System.out.println(s+"睡眠开始");
            sleep(sleepTime);
            System.out.println(s+"睡眠结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s);
    }

    public MyThread(String s, int sleepTime) {
        this.s = s;
        this.sleepTime = sleepTime;
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread("1234", 3000);
        MyThread myThread1=new MyThread("4567", 3000);
        MyThread myThread2=new MyThread("7890", 3000);
        myThread.start();
//        myThread1.start();
//        myThread2.start();
        System.out.println("测试");
    }
}
