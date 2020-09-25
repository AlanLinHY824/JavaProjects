package Thread;

/**
 * 实现多线程的第一种方法
 * 继承Thread类
 * @AlanLin 2020/7/10
 */
public class Run extends Thread{
    int distance=2000;
    int step=50;
    int current=0;
    Athlete athlete;

    @Override
    public void run() {
        while (current<distance){
            current+=step;
            try {
                sleep(100);//毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(athlete.getName()+"done!");
    }

    public Run(Athlete athlete) {
        this.athlete = athlete;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public Run setAthlete(Athlete athlete) {
        this.athlete = athlete;
        return this;
    }
}
