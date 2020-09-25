package array;

/**
 * @AlanLin 2020/6/22
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //定义数组
        int[] data=new int[6];
        double[] array2=new double[10];
        data[1]=100;
        //data[6]=2;//运行时报错：下标越界ArrayIndexOutOfBoundsException
        
        int[] array3={1,2,2,3,3,2};

        for (int a:array3
             ) {
            System.out.println(a);
            
        }

    }
}
