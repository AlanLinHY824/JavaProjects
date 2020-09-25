package homework02;

/**
 * @AlanLin 2020/6/19
 */
public class Test {
    public static void main(String[] args) {
        Car c1=new Car("丰田", "黑色", 20.2);
        Car c2=new Car("丰田", "银色", 20.2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.equals(c2));
    }
}
