package demo5;

/**
 * @AlanLin 2020/6/20
 */
public interface MyInterface  {
    //接口中可以包含抽象方法，默认有public abstract
    static final int a=100;
    static int b=0;
    public int c=0;

    default void a(){

    }
}
