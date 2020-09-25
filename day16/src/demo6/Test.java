package demo6;

/**
 * @AlanLin 2020/6/18
 */
public class Test {
    public static void main(String[] args) {
        Master m=new Master();
        m.feed(new Cat());
        m.feed(new Dog());
        /*
            多态的好处：降低程序的耦合度，提高程序的扩展力

         */
    }
}
