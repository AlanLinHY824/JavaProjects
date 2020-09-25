package demo3;

/**
 * @AlanLin 2020/6/20
 */
public class Test {
    public static void main(String[] args) {
        //Pet p=new Pet();接口不能实例化

        Pet p=new Dog();//多态，向上转型
        p.eat();

        p=new Cat();
        p.eat();
    }
}
