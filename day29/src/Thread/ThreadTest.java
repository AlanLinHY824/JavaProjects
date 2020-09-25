package Thread;

/**
 * @AlanLin 2020/7/11
 */
public class ThreadTest implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) {
//        Thread thread=new Thread(new ThreadTest(),"mythread");
//        System.out.println(thread.getId());
//        System.out.println(thread.getName());
//        Thread thread1=new Thread("mythread"){
//            @Override
//            public void run() {
//                System.out.println(currentThread());
//            }
//        };
//        thread1.start();
//
//        System.out.println(Thread.currentThread().getPriority());
            String str="abc";
        for (int i = 0; i <str.length() ; i++) {

            System.out.println(str.toCharArray()[i]);
        }
    }
}
