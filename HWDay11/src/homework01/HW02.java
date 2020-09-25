package homework01;

import java.util.Scanner;

/**
 * 2.判断一个数是正数还是负数
 * @AlanLin 2020/6/12
 */
public class HW02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入需要判断的数：");
        double num=input.nextDouble();
        isNumber(num);
    }
    public static String isNumber(double num){
        if (num>0){
            return "正数";
        }
        else if (num<0){
            return "负数";
        }
        return "0";
    }
}
