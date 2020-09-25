package protectedthread;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @AlanLin 2020/7/11
 */
public class Angela extends Thread {
    Genji genji;
    int status=1;

    @Override
    public void run() {
        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                if (genji.hp<=1000 && status==1){
                    System.out.println("奶妈来了！");
                    genji.hp+=1000;
                    System.out.println("恢复后血量为："+genji.hp);
                    status=0;
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0, 500);
    }
}
