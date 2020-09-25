package demo4;

/**
 * @AlanLin 2020/6/20
 */
public interface IBusiness {
    void speak();

    default void A2(){
        System.out.println("A2");
    }
}
