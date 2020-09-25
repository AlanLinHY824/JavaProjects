package homework05;

/**
 * 定义方法, 交换int[]数组指定位置的元素
 * int [] data = {11,22,33,44};
 * swap( data, 0, 2);
 * 再输出data数组元素时,显示 33,22,11,44
 * @AlanLin 2020/6/23
 */
public class Exchange {
    public static void main(String[] args) {
        int [] data = {11,22,33,44};
        swap( data, 0, 2);
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+"\t");
        }
    }

    public static void swap(int[] data, int a, int b) {
        if (a<0||a>=data.length||b<0||b>=data.length){
            System.out.println("下标越界");
        }
        else {
        int buffer;
        buffer=data[a];
        data[a]=data[b];
        data[b]=buffer;
        }
    }
}
