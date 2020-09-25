package Thread.bank;

/**
 * @AlanLin 2020/7/10
 */
public class Account {
    public Integer balance=0;

    public void withdraw(){
        synchronized (this){
            System.out.println("尝试取钱");
            if (balance<=1000){
                try {
                    System.out.println("进入等待");
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("结束等待");
            balance-=100;
            System.out.println("取钱成功,余额为："+balance);
            this.notify();
        }

    }

    public void save(){
        synchronized (this){
            while (true){
                balance+=100;
                System.out.println("存钱成功,余额为："+balance);
                if (balance>1000){
                    this.notify();
                    break;
                }
            }
        }

    }
}
