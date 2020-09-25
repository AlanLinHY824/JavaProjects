package Thread;

import Thread.bank.Account;

import java.util.Scanner;

/**
 * @AlanLin 2020/7/10
 */
public class Bank extends Thread{
    Account account;

    public Bank(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            synchronized (account){
                Scanner scanner=new Scanner(System.in);
                System.out.println("请输入要选择的业务：");
                System.out.println("1、存钱；2、取钱");
                int choice=scanner.nextInt();
                if (choice==1){
                    account.save();
                }else {
                    account.withdraw();
                }
            }
        }


    }
}
