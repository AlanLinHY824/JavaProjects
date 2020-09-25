package homework02;

/**
 * @AlanLin 2020/6/15
 */
public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.print();
        System.out.println("==========================");
        Dog dog1=new Dog("大黄", 5, "哈士奇");
        Dog dog2=new Dog("迪迪", 3, '公', 15.6, "泰迪");
        dog1.print();
        System.out.println("==========================");
        dog2.print();
    }
}
