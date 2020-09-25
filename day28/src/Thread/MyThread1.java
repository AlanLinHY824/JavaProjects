package Thread;

/**
 * @AlanLin 2020/7/10
 */
public class MyThread1 implements Runnable{
    static int count=0;
    @Override
    public void run() {
        System.out.println("线程运行");
            count++;
        //doSome("支线程");
        System.out.println("结束"+count);
    }

    public static void doSome(String s){
        System.out.println("doSome被"+s+"执行");
    }

    public static void main(String[] args) {
        Thread thread=new Thread(new MyThread1());
        thread.start();

//        try {
//            Thread.sleep(0);
//            //System.out.println("main方法打印语句");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        count++;
        System.out.println(count);
        System.out.println("main方法结束");

    }
}
