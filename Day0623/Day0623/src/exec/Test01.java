package Day0623.src.exec;

import java.util.Scanner;

/**
 *  定义存储10个double小数的数组, 从键盘输入10个小数存储到数组中, 遍历数组的所有元素, 同时找出数组中的最大值
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 定义数组存储10个小数
        double [] data = new double[10];

        //2) 从键盘输入10个小数存储到数组中
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < data.length; i++) {
            System.out.println("请输入第"+ (i+1) +"个数");
            data[i] = sc.nextDouble();
        }

        //3)遍历数组的所有元素
        for(double x : data ){
            System.out.print( x + "\t");
        }
        System.out.println();

        //4) 找最大的元素
        double max = data[0];       //先假设第0个元素最大
        //遍历数组后面的元素
        for(int i = 1; i < data.length; i++){
            if ( data[i] > max) {
                //如果有某个元素比max还大,则该元素就是当前最大的元素
                max = data[i];
            }
        }
        System.out.println("最大元素: " + max );
    }
}
