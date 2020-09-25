package chapter25.generic;

/**
 * @AlanLin 2020/7/31
 */
public class Demo<T> {
    T t;
    public static void main(String[] args) {
        Demo<?> demo=new Demo<>();
        Demo<String> demo1=new Demo<>();
        Demo demo3=new Demo();
        demo3.t="123";
        demo3.t=123;
        System.out.println();
    }
}
