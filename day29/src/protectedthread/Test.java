package protectedthread;

/**
 * 守护线程的使用
 * @AlanLin 2020/7/11
 */
public class Test {
    public static void main(String[] args) {
        Genji genji=new Genji();
        Angela angela=new Angela();
        angela.genji=genji;
        angela.setDaemon(true);
        genji.start();
        angela.start();
    }
}
