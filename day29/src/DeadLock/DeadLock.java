package DeadLock;

/**
 * @AlanLin 2020/7/11
 */
public class DeadLock {
    public static void main(String[] args) {

        Object lock1=new Object();
        Object lock2=new Object();
        Object commonLock=new Object();

        for (int i = 0; i <10 ; i++) {
            Thread thread=new Thread(){
                @Override
                public void run() {
                    synchronized (lock1){
                        System.out.println("由山西通往河北，目前在山西境内");//执行到此处，线程2也在同步执行，到第一行打印语句，但是再往下执行时lock2已经被线程2锁定，线程1无法执行，同样地，lock1被线程2锁定，线程1无法执行拿到lock1，无法向下执行
                        synchronized (lock2){
                            System.out.println("由山西通往河北，目前在河北境内");
                        }
                    }
                    System.out.println("已通过");
                }
            };

            Thread thread2=new Thread(){
                @Override
                public void run() {
                    synchronized (lock2){
                        System.out.println("由河北通往山西，目前在河北境内");
                        synchronized (lock1){
                            System.out.println("由河北通往山西，目前在山西境内");
                        }
                    }
                    System.out.println("已通过");

                }
            };
            thread.start();
            thread2.start();
        }
    }
}
