package homework03;

/**
 * @AlanLin 2020/6/18
 */
public class Tiger extends Pet {
    @Override
    public void eat() {
        System.out.println(nickname+"正在吃肉");
    }

    public Tiger(String nickname) {
        super(nickname);
    }

    public Tiger() {
    }
}
