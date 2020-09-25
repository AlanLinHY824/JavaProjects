package Day0623.src.exec;

import java.util.Scanner;

/**
 * 从键盘上一个一位整数, 打印这整数对应的汉字
 */
public class Test02 {
    public static void main(String[] args) {
        //从键盘上一个一位整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个一位正整数");
        int num = sc.nextInt();

        //打印这整数对应的汉字
        //定义存储字符串的数组
        String [] chinese = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        System.out.println("数字对应的汉字: " + chinese[num] );
    }
}
