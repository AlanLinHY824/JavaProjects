package Day0623.src.array;

/**
 * 定义方法向数组中插入元素
 */
public class Test05 {
    public static void main(String[] args) {
        int [] data = {12,23,34,45,56,67,78,89};

        //调用方法insert方法向数组中插入元素, 再把返回的新数组赋值给data
        data = insert( data, 3 , 456);

        Test01.printIntArray(data);     //12,23,34,456 , 45,56,67,78,89
    }

    //定义方法, 向array数组指定的i位置插入元素key
    private static int[] insert(int[] array, int i, int key) {
        //1) 定义较大的数组
        int [] bigger = new int[ array.length + 1 ];
        //2) 把原数组[0, i)范围内的元素复制到新数组中[0,i)
        System.arraycopy(array, 0, bigger, 0, i);
        //3) 把key元素保存到新数组i位置上
        bigger[i] = key;
        //4) 把原数组[i, length)范围内的元素复制到新数组i+1开始的位置上
        System.arraycopy(array, i, bigger, i+1, array.length - i);
        //5) 返回新的数组
        return bigger;
    }


}
