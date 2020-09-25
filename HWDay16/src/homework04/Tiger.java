package homework04;

/**
 * @AlanLin 2020/6/18
 */
public class Tiger extends Animals {
    public Tiger(String nickname, int age) {
        super(nickname, age);
    }

    public Tiger() {
    }

    @Override
    public void voice() {
        System.out.println("老虎叫");
    }
}
