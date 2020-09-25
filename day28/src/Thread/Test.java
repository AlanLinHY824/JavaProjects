package Thread;

import Thread.bank.Account;

import java.util.ArrayList;
import java.util.List;

/**
 * @AlanLin 2020/7/10
 */
public class Test {
    public static void main(String[] args) {
//        Athlete athlete=new Athlete();
//        athlete.setName("博尔特");
//        Thread thread=new Run(athlete);
//        Athlete athlete2=new Athlete();
//        athlete2.setName("刘易斯");
//        Thread thread2=new Run(athlete2);
//        thread.start();//跑线程
//        thread2.start();
//
//        Thread thread3=new MyThread("第一个线程",4000);
//
//        Thread thread4=new MyThread("第二个线程",4000);
//        thread3.start();
//        thread4.start();
        List<Account> list=new ArrayList<Account>();
        for (int i = 0; i <100 ; i++) {
            Account account=new Account();
            Thread thread1=new Bank(account);
            Thread thread2=new Bank(account);
            thread1.start();
            thread2.start();
            list.add(account);
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Account account : list) {
            if (account.balance!=800){
                System.out.println(account.balance);
            }
        }





    }
}
