package demo5;

/**
 * @AlanLin 2020/6/17
 */
public class Dog extends Animal {
    String breed;

    @Override
    public void print() {
        super.print();
        System.out.println("品种："+breed);
    }
}
