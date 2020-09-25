package homework03;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入1到10的整数：");
        int num=s.nextInt();
        String[] list=new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
        if (num>=0&&num<=9){
        System.out.println("该数对应的汉字为："+list[num]);
        }else {
            System.out.println("对不起，您输入的不是一位整数");
        }
    }
}
