package homework01;

/**
 * @AlanLin 2020/6/16
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year>0) {
            this.year = year;
        }
        else {
            System.out.println("年份应为大于0的整数，请重新赋值");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>=1&&month<=12){
        this.month = month;
        }
        else {
            System.out.println("月份应为1到12的整数，请重新赋值");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>=1&&day<=31) {
            this.day = day;
        }
        else {
            System.out.println("日期不应超过31，请重新赋值");
        }
    }

}
