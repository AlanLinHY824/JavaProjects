package Day0623.src.array;

/**
 * 向数组中插入元素
 */
public class Test04 {
    public static void main(String[] args) {
        int [] data = {12,23,34,45,56,67,78,89};

        //需求: 向data数组索引值为2的位置插入元素789
        int i = 2;      //要插入的索引值
        int key = 789;  //插入的元素

        //1) 定义较大的数组
        int [] bigger = new int[ data.length + 1 ];
        //2) 把原数组[0, i)范围内的元素复制到新数组中[0,i)
        System.arraycopy(data, 0, bigger, 0, i);
        //3) 把key元素保存到新数组i位置上
        bigger[i] = key;
        //4) 把原数组[i, length)范围内的元素复制到新数组i+1开始的位置上
        System.arraycopy(data, i, bigger, i+1, data.length - i);
        //5)让原来数组名指向新的数组
        data = bigger;
        //打印data
        Test01.printIntArray(data);
    }
}
