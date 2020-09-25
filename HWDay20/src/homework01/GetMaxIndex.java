package homework01;

import java.util.Scanner;

/**
 * @AlanLin 2020/6/23
 */
public class GetMaxIndex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        double [] arr1=new double[10];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("请输入第"+i+"个数字，每个数字输入按回车键结束：");
            arr1[i]=s.nextDouble();
        }
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
