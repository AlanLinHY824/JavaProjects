package protectedthread;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @AlanLin 2020/7/11
 */
public class Genji extends Thread {
    int hp=2000;

    @Override
    public void run() {

        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                if (hp>0) {
                    hp -= 100;
                    System.out.println("源氏收到伤害，hp-100，剩余hp：" + hp);
                }else {
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0, 500);

    }
}
