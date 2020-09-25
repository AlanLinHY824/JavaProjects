package Thread.bank;

/**
 * @AlanLin 2020/7/11
 */
public class Withdraw extends Thread {
    Account account;
    @Override
    public void run() {
        account.withdraw();
    }
}
