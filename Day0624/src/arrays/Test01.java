package arrays;

import java.util.Arrays;

/**
 * Arrays工具类提供一组操作数组的方法
 */
public class Test01 {
    public static void main(String[] args) {
        int [] data = {43,34,12,67,89,6,23};

        //1) 调用Arrays.toString()可以把数组元素连接为字符串
        String txt = Arrays.toString(data);
        System.out.println(txt);        //[43, 34, 12, 67, 89, 6, 23]

        //2) 调用Arrays.copyOf()方法可以实现数组的复制
//        Arrays.copyOf(源数组, 新数组长度) 返回新的数组
        int[] bigger = Arrays.copyOf(data, data.length * 2);    //新数组长度更大相当于扩容
        System.out.println( Arrays.toString(bigger));
        int [] smaller = Arrays.copyOf(data, data.length / 2);  //新数组长度也可以更小
        System.out.println( Arrays.toString(smaller ));

        //3) 调用Arrays.sort()可以对数组排序（基本数据类型）
        Arrays.sort(data);
        System.out.println( Arrays.toString(data));  //[6, 12, 23, 34, 43, 67, 89]

        //4) 二分查找
        System.out.println( Arrays.binarySearch(data, 6));
        System.out.println( Arrays.binarySearch(data, 50));     //-6负数就表示不存在
        System.out.println( Arrays.binarySearch(data, 89));
    }
}
