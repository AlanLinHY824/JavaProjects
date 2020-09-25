package exec;

/**
 * 定义方法, 交换int[]数组指定位置的元素
 * int [] data = {11,22,33,44};
 * swap( data, 0, 2);
 */
public class Test05 {
    public static void main(String[] args) {
        int [] data = {11,22,33,44};
        swap( data, 0, 2);
        System.out.println( Test04.toString(data));
    }

    //定义方法实现数组中两个位置元素的交换
    private static void swap(int[] data, int i, int j) {
        if ( i < 0 || i >= data.length || j < 0 || j >= data.length){
            System.out.println("交换元素的下标越界");
            return;
        }

        int t = data[i];
        data[i] = data[j];
        data[j] = t;
    }
}
