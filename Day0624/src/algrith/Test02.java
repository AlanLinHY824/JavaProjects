package algrith;

import exec.Test04;

/**
 * 选择排序
 */
public class Test02 {
    public static void main(String[] args) {
        int [] data = {34,65,87,23,43,65,9};

        //由小到大, 选择当前数中最小的交换到前面
        for( int  x = 0 ; x < data.length - 1;  x++){         //外层循环控制比较的轮次
            int   min  = x;
            for( int i = min+1; i < data.length; i++){        //内层循环找最小元素的下标
                if( data[i] < data[min] )   min = i;
            }
//            data[x] 与 data[min]交换
            if ( x != min ) {
                int t = data[x];
                data[x] = data[min];
                data[min] = t;
            }
        System.out.println(Test04.toString(data));
        }

    }
}
