package Thread.bank;

/**
 * @AlanLin 2020/7/11
 */
public class Test01 {
    public static void main(String[] args) {
        Account account=new Account();
        Withdraw with=new Withdraw();
        Save save=new Save();
        with.account=account;
        save.account=account;
        with.start();
        save.start();

    }
}
