package homework02;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/23
 */
public class GetChineseSimple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个十二位以内的正整数：");
        long num1=s.nextLong();
        System.out.println(getChinese(num1));
    }

    public static String getChinese(long num1) {
        String txt="";
        int count=0;
        String[] list=new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
        String[] unit=new String[]{"圆","拾","佰","仟","万","拾","佰","仟","亿","拾","佰","千"};//万以上不需要给完整单位，只需要给出除了“万”以外的单位
        while (num1>0){
            int r =(int)num1%10;
            txt=list[r]+unit[count++]+txt;
            num1/=10;
        }
        return txt;
    }
}
