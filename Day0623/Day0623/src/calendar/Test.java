package Day0623.src.calendar;

import java.util.Scanner;

/**
 * 从键盘上输入年和月, 打印该月日历
 */
public class Test {
    public static void main(String[] args) {
        //1)输入年和月
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年和月");
        int year = sc.nextInt();
        int month = sc.nextInt();

        //2 打印日历
        printCalendar( year, month);
    }

    //打印指定月份的日历
    private static void printCalendar(int year, int month) {
        //表头
        System.out.println("\t一\t二\t三\t四\t五\t六\t日");

        //计算本月1号是星期几
        int weekday = getWeekDay(year,month,1);        //数字0表示星期日,数组1表示星期一

        //打印前面的空白
        int spaceNum = ( weekday - 1+ 7  ) % 7 ;    //空白的数量
        for (int i = 0; i < spaceNum; i++) {
            System.out.print("\t");
        }

        //打印本月的数字
        int monthdays = getMonthDays(year, month);         //当前月的天数
        int count = spaceNum;         //定义变量统计打印数字的数量
        for(int d = 1;  d <= monthdays; d++){
            System.out.print("\t" + d);
            count++;        //打印完数字后, 计数器加1
            if ( count % 7 == 0 ){
                System.out.println();
            }
        }
    }
    //定义方法,计算日期指定日期是星期几
    private static int getWeekDay(int year, int month, int day) {
        //1900-1-1是星期一, 计算日期距离1900-1-1有多少天, 总天数对7求余的余数就是星期几
        int sum = 0 ;
        //先累加整年的天数
        for(int y = 1900; y < year; y++){
            sum += isLeap(y) ? 366 : 365;
        }

        // 再累加当前年中整月的天数
        for( int x = 1;  x < month; x++ ){
            //把第x个月的天数进行累加
            sum += getMonthDays( year,  x );
        }

        //再累加当前月的天数
        sum += day;
        //返回总天数对7求余的余数
        return sum % 7 ;
    }

    //定义方法返回指定月份的天数
    private static int getMonthDays(int year, int month) {
        switch ( month ){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                //闰年29天,平年28天
                if ( isLeap( year ) ){
                    return 29;
                }else {
                    return 28;
                }
        }

        return 0;
    }

    //定义方法判断闰年
    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


}
