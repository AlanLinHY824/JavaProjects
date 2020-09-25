package homework08;

/**
 * 8 定义方法删除数组中指定位置的元素
 * @AlanLin 2020/6/23
 */
public class Delete {
    public static void main(String[] args) {
        int[]arr1={12,45,85,62,15,35,72};
        int size=7;
        delete(arr1,size,5);
        size--;
        for (int i = 0; i <size ; i++) {
            System.out.print(arr1[i]+"\t");
        }
    }

    private static void delete(int[] arr1, int size, int index) {
        System.arraycopy(arr1, index+1, arr1, index, size-index-1);
        arr1[size-1]=0;
    }

    private static void delete(String[] arr1, int size, int index) {
        System.arraycopy(arr1, index+1, arr1, index, size-index-1);
        arr1[size-1]=null;
    }

    private static void delete(double[] arr1, int size, int index) {
        System.arraycopy(arr1, index+1, arr1, index, size-index-1);
        arr1[size-1]=0.0;
    }

    private static void delete(char[] arr1, int size, int index) {
        System.arraycopy(arr1, index+1, arr1, index, size-index-1);
        arr1[size-1]='\u0000';
    }

}
