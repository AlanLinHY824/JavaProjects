package homework02;

/**
 * @AlanLin 2020/6/20
 */
public class Birds extends Animals {
    @Override
    public void voice() {
        System.out.println("鸟儿在歌唱~");
    }

    public Birds() {
    }

    public Birds(String nickname, int age) {
        super(nickname, age);
    }


}
