package getdate;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        int month=s.nextInt();
        int day=s.nextInt();
        int days = getDays(year, month, day);
        if (days == 0) {
            System.out.println("请重新输入");
        }else {
            System.out.println(year+"年"+month+"月"+day+"日"+"是该年的第"+days+"天");
        }

    }

    public static int getDays(int year, int month, int day) {
        int days=day;
        MyDate myDate=new MyDate(year,month,day);
        if (myDate.getDay()==0||myDate.getMonth()==0||myDate.getYear()==0){
            days=0;
        }
        else {
            for (int i = 1; i <month ; i++) {
                days=days+myDate.getDays(i);
            }
        }
        return days;
    }
}
