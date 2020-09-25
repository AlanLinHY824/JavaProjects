package demo4;

/**
 * @AlanLin 2020/6/20
 */
public interface ICode {
    void code();

    public default void A1(){
        System.out.println("default方法");
    }
}
