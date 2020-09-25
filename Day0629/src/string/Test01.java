package string;

import java.util.Scanner;

/**
 *从键盘上输入身份证号, 判断出生日期及性别(倒数第二位奇数表示男,偶数是女)
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号");
        String pId = sc.next();     //102030199610201234

        //对输入身份证格式验证, 先定义一个身份证号正则表达式, 第一位不能是0,最后一位可以是数字或者X
        String pattern = "[1-9]\\d{16}[0-9X]";
        while (!pId.matches(pattern)){
            System.out.println("身份证号格式不正确,请重新输入");
            pId = sc.next();
        }

        String yearStr = pId.substring(6, 10);
        String monthStr = pId.substring(10, 12);
        String dayStr = pId.substring(12, 14);
        System.out.println( "出生日期:" + yearStr + "年" + monthStr + "月" + dayStr + "日");

        //判断性别(倒数第二位)
        char cc = pId.charAt(16);       //'3'
//        if ( cc % 2 == 0 ){ //'0'码值是48, '1'的码值是49, 整数的奇偶性与码值的奇偶性是一致的,可以直接使用码值的奇偶性来判断性别
//        int num = (int)cc;      //num=51
        int num = cc - '0';         //num=3
        if(num % 2 == 0 ){
            System.out.println("性别:女");
        }else {
            System.out.println("性别:男");
        }

        //取字符串
        String ggStr = pId.substring(16, 17);       //取[16,17)范围内的字符串, "3"
        int gender = Integer.parseInt(ggStr);   //把字符串"3"转换为数字3
        if(gender % 2 == 0 ){
            System.out.println("性别:女");
        }else {
            System.out.println("性别:男");
        }
    }
}
