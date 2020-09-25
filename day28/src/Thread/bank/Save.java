package Thread.bank;

/**
 * @AlanLin 2020/7/11
 */
public class Save extends Thread{
    Account account;

    @Override
    public void run() {
        account.save();
    }
}
