package getdate;

/**
 * @AlanLin 2020/6/22
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public MyDate setYear(int year) {
        if (year>0){
        this.year = year;}
        else {
            System.out.println("年份输入错误");
            this.year=0;
        }
        return this;
    }

    public int getMonth() {
        return month;
    }

    public MyDate setMonth(int month) {
        if (month>=1&&month<=12){
            this.month = month;
        }
        else {
            System.out.println("月份输入错误");
            this.month=0;
        }
        return this;
    }

    public int getDay() {
        return day;
    }

    public MyDate setDay(int day) {
        switch (this.month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day>0&&day<=31){
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("日期输入有误");
                    this.day = 0;
                    break;
                }
            case 4: case 6: case 9: case 11:
                if (day>0&&day<=30){
                    this.day = day;
                    break;
                }
                else {
                    System.out.println("日期输入有误");
                    this.day = 0;
                    break;
                }
            case 2:
                if (year%4==0&&year%100!=0||year%400==0){
                    if (day>0&&day<=29){
                        this.day = day;
                        break;
                    }
                    else {
                        System.out.println("日期输入有误");
                        this.day = 0;
                        break;
                    }
                }
                else {
                    if (day>0&&day<=28){
                        this.day = day;
                        break;
                    }
                    else {
                        System.out.println("日期输入有误");
                        this.day = 0;
                        break;
                    }
                }
            default:
                System.out.println("请先输入月份");
                this.day=0;
        }

        return this;
    }

    public int getDays(int month){
        if (this.year==0||this.month==0||this.day==0){
            System.out.println("对不起，请重新输入月份和年份");
            return 0;
        }else {
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    if (this.year%4==0&&this.year%100!=0||this.year%400==0){
                        return 29;
                    }
                    else {
                        return 28;
                    }
                default:
                    System.out.println("对不起，月份输入错误");
                    return 0;
            }
        }
    }

}
