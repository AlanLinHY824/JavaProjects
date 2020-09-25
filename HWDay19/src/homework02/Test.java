package homework02;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/22
 */
public class Test {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入10个double类型的数字，每个数字输入按回车键确认");

        double [] arr1=new double[10];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=s.nextDouble();
        }

        double max=0;
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+"\t");
            if (arr1[i]>max){
                max=arr1[i];
            }
        }
        System.out.println("\n"+"数组中最大的数字为"+max);

        System.out.println("最大数字的索引值为："+getMaxIndex(arr1));

    }

    private static int getMaxIndex(double[] arr1) {
        double max=arr1[1];
        int index=0;
        for (int i = 1; i <arr1.length ; i++) {
            if (arr1[i]>max){
                max=arr1[i];
                index=i;
            }
        }
        return index;
    }
}
