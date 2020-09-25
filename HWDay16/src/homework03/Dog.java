package homework03;

/**
 * @AlanLin 2020/6/18
 */
public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println(nickname+"正在吃狗粮");
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public Dog() {
    }
}
