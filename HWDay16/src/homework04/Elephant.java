package homework04;

/**
 * @AlanLin 2020/6/18
 */
public class Elephant extends Animals{
    public Elephant(String nickname, int age) {
        super(nickname, age);
    }

    public Elephant() {
    }

    @Override
    public void voice() {
        System.out.println("大象叫");
    }
}
