package demo4;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        SE se=new SE();

        se.code();
        se.speak();

        se.A1();
        System.out.println(new IBusiness() {
            @Override
            public void speak() {
                System.out.println("xx");
            }
        });
    }
}
