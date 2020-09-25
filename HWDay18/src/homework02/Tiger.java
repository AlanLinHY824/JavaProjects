package homework02;

/**
 * @AlanLin 2020/6/20
 */
public class Tiger extends Animals{
    @Override
    public void voice() {
        System.out.println("老虎怒吼~");
    }

    public Tiger() {
    }

    public Tiger(String nickname, int age) {
        super(nickname, age);
    }



}
