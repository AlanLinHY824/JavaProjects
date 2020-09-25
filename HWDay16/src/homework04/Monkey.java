package homework04;

/**
 * @AlanLin 2020/6/18
 */
public class Monkey extends Animals{
    public Monkey(String nickname, int age) {
        super(nickname, age);
    }

    public Monkey() {
    }

    @Override
    public void show() {
        System.out.println("猴子叫");
    }
}
