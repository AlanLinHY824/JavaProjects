package homework04;

/**
 * @AlanLin 2020/6/18
 */
public class Lion extends Animals{
    public Lion(String nickname, int age) {
        super(nickname, age);
    }

    public Lion() {
    }

    @Override
    public void voice() {
        System.out.println("狮子叫");
    }
}
