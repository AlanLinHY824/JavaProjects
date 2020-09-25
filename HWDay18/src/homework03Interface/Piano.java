package homework03Interface;

/**
 * @AlanLin 2020/6/20
 */
public class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("演奏钢琴中");
    }
}
