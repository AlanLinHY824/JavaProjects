package homework02;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/23
 */
public class GetChinese {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个十二位以内的正整数：");
        long num1=s.nextLong();
        int[] num=new int[12];
        int size = getSize(num1, num);
        getChinese(num, size);
    }

    public static void getChinese(int[] num, int size) {
        while (size>0){
            String[] list=new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
            String[] unit=new String[]{"圆","拾","佰","仟","万","拾万","佰万","仟万","亿","拾亿","佰亿","千亿"};
            if (size<=4){
                System.out.print(list[num[size-1]]+unit[size-1]);
                size--;
            }else if (size>4&&size<=8){
                System.out.print(list[num[size-1]]);
                size--;
                System.out.print(size==4?"万":unit[size-4]);
            }
            else if (size>8&&size<=12){
                System.out.print(list[num[size-1]]);
                size--;
                System.out.print(size==8?"亿":unit[size-8]);
            }
        }
    }

    public static int getSize(long num1, int[] num) {
        int size=0;
        for (int i = 0; i <num.length ; i++) {
            if (num1/10>=1){
                num[i]=(int)num1%10;
                num1/=10;
                size++;
            }else {
                num[i]=(int)num1;
                size++;
                break;
            }
        }
        return size;
    }
}
