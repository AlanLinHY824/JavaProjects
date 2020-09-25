package demo5;

/**
 * @AlanLin 2020/6/17
 */
public class Cat extends Animal {
    char gender;

    @Override
    public void print() {
        super.print();
        System.out.println("性别："+gender);
    }
}
