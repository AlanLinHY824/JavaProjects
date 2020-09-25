package homework03;

/**
 * @AlanLin 2020/6/18
 */
public class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println(nickname+"正在吃小鱼");
    }

    public Cat(String nickname) {
        super(nickname);
    }

    public Cat() {
        super();
    }
}
