package printCalendar;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        int month=s.nextInt();
        Test.getCalendar(year,month);

    }

    private static void getCalendar(int year, int month) {
        if (month<=0&&month>12||year<1990){
            System.out.println("年份或月份输入错误，请重新输入");
            return;
        }
        //得到当前之前各年份的天数求和
        int dayGap=0;
        for (int i = 1900; i <year ; i++) {
            if (i%4==0&&i%100!=0||i%400==0){
                dayGap+=366;
            }
            else {
                dayGap+=365;
            }
        }
        for (int i = 1; i <month ; i++) {
            //得到当年的天数
            dayGap+=getDay(year,i);
        }
        //打印日历
        printCalendar(year, month, dayGap);
    }

    private static void printCalendar(int year, int month, int dayGap) {
        //1号的星期数
        int firstDay=1+dayGap%7;
        //记录星期数
        int weekday=firstDay;
        //打印表头
        System.out.println(year+"年"+month+"月");
        System.out.println("一\t"+"二\t"+"三\t"+"四\t"+"五\t"+"六\t"+"日\t");
        //打印1号前的空白
        for (int i = 1; i <firstDay ; i++) {
            System.out.print(" \t");
        }
        //打印日历
        for (int i = 1; i <=getDay(year, month); i++) {
            System.out.print(i+" "+"\t");
            if (weekday%7==0){
                System.out.println();
            }
            weekday+=1;
        }
    }

    private static int getDay(int year,int month) {
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (year%4==0&&year%100!=0||year%400==0){
                    return 29;
                }
                else {
                    return 28;
                }
            default:
                return 0;

        }
    }

}
