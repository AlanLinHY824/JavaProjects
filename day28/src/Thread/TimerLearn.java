package Thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @AlanLin 2020/7/10
 */
public class TimerLearn {
    public static void main(String[] args) {
        Timer timer=new Timer();
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务被执行了");
                //timer.cancel();
            }
        };

        timer.schedule(timerTask,2000);//延迟时间，毫秒数
        timer.schedule(timerTask,new Date(),2000);//给定第一次执行的时间，周期执行
        timer.schedule(timerTask,0,2000);//给定第一次执行的延迟时间，周期执行


    }
}
