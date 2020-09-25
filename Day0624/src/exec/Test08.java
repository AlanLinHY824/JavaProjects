package exec;

/**
 * 定义方法删除数组中指定位置的元素
 */
public class Test08 {
    public static void main(String[] args) {
        int [] data = {23,45,67,78,9,34,65,21};

        //删除元素
        data = delete(data, 2);

        System.out.println( Test04.toString(data));

    }

    //定义方法删除数组中指定位置的元素
    public static int[] delete( int [] array, int i ){
        //在方法体中删除array数组中索引值为i的元素
        //定义较小的数组
        int [] smaller = new int[array.length - 1];
        //把前面i个元素复制到新数组中
        System.arraycopy(array, 0, smaller, 0, i);
        //把array数组从i+1开始的元素复制到smaller数组中从i开始的位置上
        System.arraycopy(array, i+1, smaller, i, array.length - i - 1);
        //把新数组返回
        return  smaller;
    }
}
