package algrith;

/**
 * 二分查找
 */
public class Test03 {
    public static void main(String[] args) {
        int [] data = {11,22,33,44,55,66,77,88};

        System.out.println( binarySearch( data, 11));
        System.out.println( binarySearch( data, 88));
        System.out.println( binarySearch( data, 50));
    }

    //采用二分查找算法,在数组中返回key元素的索引值 ,如果array数组中不存在key元素返回-1
    public static int binarySearch(int [] array, int key){
        int begin = 0 ;     //查找范围的起始位置
        int end = array.length - 1;     //查找范围的结束位置
        int mid = (begin + end) / 2;    //查找中间位置

        while ( begin <= end ){
            if ( array[mid] == key ){
                return  mid;
            }else  if( array[mid] > key ){
                //把范围缩小到左一半
                end = mid - 1;
                mid = (begin + end) / 2;
            }else {         // 中间元素比key元素小
                //把范围缩小到右一半
                begin = mid + 1;
                mid = (begin + end) / 2;
            }
        }
        //当begin> end循环结束 , 表示 元素不存在
        return -1;
    }
}
