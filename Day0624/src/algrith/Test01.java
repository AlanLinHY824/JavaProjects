package algrith;

import exec.Test04;

/**
 * 冒泡排序算法
 */
public class Test01 {
    public static void main(String[] args) {
        int [] data = {34,12,6,89,24,43};
        System.out.println(Test04.toString(data));

        //由小到大排序, 就把大的数交换到后面
        //由大到小排序, 就把小的数交换到后面
        for(int x = 0 ; x < data.length - 1; x++){
            for (int i = 0; i < data.length - 1 - x; i++) {
//                if ( data[i] > data[i+1] ){     //前面的数比后面的大就交换
                if ( data[i] < data[i+1] ){     //前面的数比后面的小就交换, 把小的交换到后面
                    int t = data[i];
                    data[i] = data[i+1];
                    data[i+1] = t;
                }
                System.out.println(Test04.toString(data));
            }
            System.out.println("-----------第" + (x+1) + "轮完成---------------");
        }


    }
}
