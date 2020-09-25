package Thread;

/**
 * 学习线程额优先级
 * @AlanLin 2020/7/11
 */
public class Priority {
    public static void main(String[] args) {
        //yieldLearn();
        //joinLearn();
        priorityLearn();
    }
    public static void yieldLearn(){
        Thread thread1=new Thread("线程一"){
            @Override
            public void run() {
                for (int i = 0; i <1000; i++) {
                    //yield();
                    System.out.println(currentThread().getName()+i);
                }
            }
        };
        Thread thread2=new Thread("线程二"){
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println(currentThread().getName()+i);
                }
            }
        };

        thread1.start();
        thread2.start();
    }
    public static void joinLearn(){
        Thread thread1=new Thread("线程一"){
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    //yield();
                    System.out.println(currentThread().getName()+i);
                }
            }
        };
        Thread thread2=new Thread("线程二"){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(currentThread().getName()+i);
                }
            }
        };

        thread1.start();
        try {
            thread1.join();//暂停当前调用它的线程，即暂停main方法所在的线程，等待thread1执行结束后再继续
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
    public static void priorityLearn(){
        Thread thread1=new Thread("线程一"){
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    //yield();
                    System.out.println(currentThread().getName()+i);
                }
            }
        };
        Thread thread2=new Thread("线程二"){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(currentThread().getName()+i);
                }
            }
        };
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
    }
}
