package homework03;

import java.util.Scanner;

/**
 * 最优化版本，用字符串接收输入值
 * 还可以考虑，用数组接收，直接按照位数进行输入，但是会比较固定，要先确定输入的是几位数
 * @AlanLin 2020/6/23
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个整数：");
        String num1=s.next();
        String[] list=new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
        String[] unit=new String[]{"圆","拾","佰","仟","万","拾万","佰万","仟万","亿","拾亿","佰亿","千亿"};
//        if (num1.length()<=4){
//            for (int i = 0; i <num1.length() ; i++) {
//                System.out.print(list[num1.charAt(i)-48]+unit[num1.length()-1-i]);
//            }
//        }
//        else if (num1.length()>4&&num1.length()<=8){
//            for (int i = 0; i <num1.length()-4 ; i++) {
//                System.out.print(list[num1.charAt(i)-48]);
//                System.out.println(i==num1.length()-5?"万":unit[num1.length()-5-i]);
//            }
//            for (int i = num1.length()-4; i <num1.length() ; i++) {
//                System.out.print(list[num1.charAt(i)-48]+unit[num1.length()-1-i]);
//            }
//        }
//        else if (num1.length()>8&&num1.length()<=12){
//            for (int i = 0; i <num1.length()-8 ; i++) {
//                System.out.print(list[num1.charAt(i)-48]);
//                System.out.print(i==num1.length()-9?"亿":unit[num1.length()-9-i]);
//            }
//            for (int i = num1.length()-8; i <num1.length()-4 ; i++) {
//                System.out.print(list[num1.charAt(i)-48]);
//                System.out.print(i==num1.length()-5?"万":unit[num1.length()-5-i]);
//            }
//            for (int i = num1.length()-4; i <num1.length() ; i++) {
//                System.out.print(list[num1.charAt(i)-48]+unit[num1.length()-1-i]);
//            }
            int i=0;
            while (i<num1.length()-8){
                System.out.print(list[num1.charAt(i)-48]);
                System.out.print(i==num1.length()-9?"亿":unit[num1.length()-9-i]);
                i++;
            }
            while (i<num1.length()-4){
                System.out.print(list[num1.charAt(i)-48]);
                System.out.print(i==num1.length()-5?"万":unit[num1.length()-5-i]);
                i++;
            }
            while (i<num1.length()){
                System.out.print(list[num1.charAt(i)-48]+unit[num1.length()-1-i]);
                i++;
            }
//            System.out.println();
//            i=num1.length()-1;//代表下标
//            while (i<num1.length()&&i>=0){
//                if (i>=8&&i<=num1.length()-1){
//                    System.out.print(list[num1.charAt(num1.length()-i-1)-48]);
//                    System.out.print(i==8?"亿":unit[i-8]);
//                    i--;
//                }else if (i>=4&&i<8){
//                    System.out.print(list[num1.charAt(num1.length()-i-1)-48]);
//                    System.out.print(i==4?"万":unit[i-4]);
//                    i--;
//                }else if (i<4){
//                    System.out.print(list[num1.charAt(num1.length()-i-1)-48]);
//                    System.out.print(unit[i]);
//                    i--;
//                }
//            }



//        }
    }
}
