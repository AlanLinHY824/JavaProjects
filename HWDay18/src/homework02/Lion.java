package homework02;

/**
 * @AlanLin 2020/6/20
 */
public class Lion extends Animals {
    @Override
    public void voice() {
        System.out.println("狮子的叫声~");
    }

    public Lion() {
    }

    public Lion(String nickname, int age) {
        super(nickname, age);
    }

}
