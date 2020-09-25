package homework06;

/**
 * 定义方法, 实现int[] 数组元素的逆序
 * int [] data = {11,22,33,44};
 * reverse( data );
 * 再输出data数组元素时,显示 44,33,22,11
 * @AlanLin 2020/6/23
 */
public class Reverse {
    public static void main(String[] args) {
        int [] data = {11,22,33,44};
        reverse(data);
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+"\t");
        }
    }

    private static void reverse(int[] data) {
        int[]arr1=new int[data.length];
        for (int i = 0; i <data.length ; i++) {
            arr1[i]=data[data.length-i-1];
        }
        for (int i = 0; i <data.length ; i++) {
            data[i]=arr1[i];
        }
    }
}
