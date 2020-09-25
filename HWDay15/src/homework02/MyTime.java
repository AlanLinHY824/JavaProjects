package homework02;

/**
 * 2.编写时间类，属性：时、分、秒
 * 	使用封装完成，要求：时在0---23范围内，分和秒在0---59范围内
 *   编写测试类，通过调用set方法完成对属性赋值，调用get方法输出属性的值
 * @AlanLin 2020/6/17
 */
public class MyTime {
    private int hour;
    private int min;
    private int sec;

    public int getHour() {
        return hour;
    }

    public MyTime setHour(int hour) {
        if (hour>=0&&hour<=23){
        this.hour = hour;
        }
        return this;
    }

    public int getMin() {
        return min;
    }

    public MyTime setMin(int min) {
        if (min>=0&&min<=59){
        this.min = min;
        }
        return this;
    }

    public int getSec() {
        return sec;
    }

    public MyTime setSec(int sec) {
        this.sec = sec;
        return this;
    }
}
