package exec;

/**
 * 定义方法,返回指定数组中最大元素的索引值
 */
public class Test01 {
    public static void main(String[] args) {
        int [] data = {32,45,67,8,90,65,32,12};
        System.out.println( getMaxIndex(data) );
    }

    //定义方法返回数组中最大元素的索引值
    private static int getMaxIndex(int[] array) {
        int max = 0 ;   //保存最大元素的索引值
        //从max+1开始遍历数组后面的元素, 如果有某个元素比max标识的元素还大,则该元素就是当前最大的元素, 把该元素的索引值保存到max变量 中
        for( int i = max + 1 ; i < array.length; i++ ){
            if ( array[i] >  array[max] ){
                max = i;
            }
        }
        return  max;
    }
}
