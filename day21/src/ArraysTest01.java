import java.util.Arrays;

/**
 * @AlanLin 2020/6/24
 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] data={43,34,12,67,89,6,23};

        //将数组连接为一个字符串
        String txt= Arrays.toString(data);
        System.out.println(txt);


        //数组拷贝，返回一个指定长度的同类型数组
        int[]bigger=Arrays.copyOf(data, data.length*2);//相当于数组扩容
        int[]smaller=Arrays.copyOf(data, data.length/2);//直接把后面的元素砍掉
        System.out.println(Arrays.toString(bigger));
        System.out.println(Arrays.toString(smaller));

        //对数组进行排序，数组元素个数不一样，底层用的是不同的排序方法（经过调优的排序算法）
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));

        //二分查找，返回值为负数则表示不存在
        System.out.println(Arrays.binarySearch(data, 34));

        //对象数组的排序





    }
}
