package custom3;

/**
 * @AlanLin 2020/7/11
 */
public class DeadLock2 {
    public static void main(String[] args) {

        Store lock1=new Store();
        Store lock2=new Store();
        Store commonLock=new Store();

        Thread thread=new Thread(){
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("线程1开始");
                    lock2.num=1;
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                    System.out.println("线程1结束");
                }
            }
        };

        Thread thread2=new Thread(){
            @Override
            public void run() {
                synchronized (lock1){
                    System.out.println("由河北通往山西，目前在河北境内");
//                    synchronized (lock1){
//                        System.out.println("由河北通往山西，目前在山西境内");
//                    }
                    System.out.println("已通过");
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程2结束");
                }
            }
        };
        Thread thread3=new Thread(){
            @Override
            public void run() {
                synchronized (lock2){
                    System.out.println("线程3开始");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                    System.out.println("线程3结束");
                }
            }
        };

        thread.start();
        thread2.start();
        thread3.start();
    }
}
