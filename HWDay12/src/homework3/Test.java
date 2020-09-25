package homework3;

/**
 * @AlanLin 2020/6/13
 */
public class Test {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.print();
        car1.no="沪A8888";
        car1.brand="保时捷911";
        car1.price=388.6;
        car1.color="黑色";
        System.out.println("==============");
        car1.print();
    }
}
