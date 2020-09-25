package exec;

/**
 *定义方法, 把int []类型数组元素连接为一个字符串
 * int [] data = {11,22,33,44};
 * String text = toString( data );
 * 打印text要求显示: [11,22,33,44]
 */
public class Test04 {
    public static void main(String[] args) {
        int [] data = {11,22,33,44};
        String text = toString( data );
        System.out.println( text );
    }

    //定义方法, 把int []类型数组元素连接为一个字符串
    public static String toString(int[] array) {
        String str = "[";

       /* for (int i = 0; i < array.length; i++) {
            str += array[i];
            //元素之间使用逗号,
            if ( i < array.length - 1 ){
                str += ", ";
            }
        }
        return str + "]" ;*/

        for (int i = 0; i < array.length - 1 ; i++) {
            str += array[i] + ", ";
        }
        return  str + array[array.length-1] + "]";
    }


}
