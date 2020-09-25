package Day0623.src.array;

/**
 * 数组参数与数组返回值
 */
public class Test01 {
    public static void main(String[] args) {
        //调用getIntArray()方法, 把方法的返回值保存到一个变量中
        int [] data = getIntArray(10);
        //调用方法把数组元素打印到屏幕上
        printIntArray(data);
    }

    //定义方法, 返回一个存储整数的数组, 通过参数接收一个数组的大小
    public static int []  getIntArray( int capacity){
        //根据参数接收的数组大小创建一个存储整数的数组
        int [] intArray = new int[capacity];
        //给数组元素随机初始化
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 100);
        }
        //返回数组
        return  intArray;
    }

    //定义方法, 把int[]类型数组的元素打印到屏幕上, 需要通过参数来接收int[]类型的数组
    public static void printIntArray( int [] array ){
        //把array参数数组的元素打印到屏幕上
        for (int x : array) {
            System.out.print( x + "  ");
        }
        System.out.println();
    }

}
