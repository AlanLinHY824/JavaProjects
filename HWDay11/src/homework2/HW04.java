package homework2;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/12
 */
public class HW04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入需要求和的整数：");
        int num=input.nextInt();
        if (num>=100&&num<=999){
            System.out.println(num+"的各位数字之和为"+sum(num));
        }
        else {
            System.out.println("输入的不是三位正整数");
        }
    }

    public static int sum(int num){
        int bw=num/100;
        int sw=num/10%10;
        int gw=num%10;
        return bw+sw+gw;
    }
}
