package exec;


/**
 * 定义方法, 实现int[] 数组元素的逆序
 * int [] data = {11,22,33,44};
 * reverse( data );
 */
public class Test06 {
    public static void main(String[] args) {
        int [] data = {11,22,33,44, 55};
        reverse( data );
        System.out.println( Test04.toString(data));

    }

    //定义方法实现数组元素逆序
    public static void reverse(int [] array ){
        //把前一半元素与后一半元素交换
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = t;
        }
    }
}
