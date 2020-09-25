package exec;

import java.util.Scanner;

/**
 *从键盘上输入正整数, 打印汉字货币形式
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();     //4512

        String [] chinese = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String [] units = {"圆","拾","佰","仟","万","拾","佰","仟","亿", "拾"};
        /*
            4512    -->     肆仟伍佰壹拾贰圆
            num % 10 == 2   ==> 贰圆
            num /= 10       num == 451
            num % 10 == 1   ==> 壹拾贰圆
            num /= 10       num == 45
            num % 10 == 5   ==> 伍佰壹拾贰圆
            num /= 10       num == 4
            num % 10 == 4   ==> 肆仟伍佰壹拾贰圆
            num /= 10       num == 0
         */
        int count = 0 ;     //计数器
        String txt = "";
        while ( num != 0 ){
            int r = num % 10;
//            System.out.println(" 余数: " + r + " ==> " + chinese[r] );
//            System.out.println(" 单位: " + units[count++]);
            txt = chinese[r] + units[count++] + txt;
            num /= 10;
        }
        System.out.println(txt);
    }
}
