package twodimension;

import java.util.Arrays;

/**
 *
 */
public class Test01 {
    public static void main(String[] args) {
        int [] data1 = new int[10];
        int [] data2 = {1,2,3,4,5};
        int x = 10;
        int y = 20;
        int [] data3 = { x, y };
        /*
            定义数组的语法:  数据类型 []  数组名 = new 数据类型[长度];
            int这个数据类型表示数组中存储元素的类型是整数
            []表示正在定义数组
            data1, data2, data3 数组名其实就是一个变量名, 它们的数据类型是: int []
         */
        //需求: 定义数组存储 data1, data2, data3 这三个变量
//        数据类型 [] 数组名 = {data1, data2, data3};      其中数据类型是data1, data2, data3这三个变量的类型: int []
        int [] [] twoArray1 = {data1, data2, data3};
        //对于 twoArray1 数组来说, 它的每个数组元素又是一个数组, 称twoArray1为二维数组, 二维数组是一维数组的数组.  也可以简单的理解为,在定义数组时,使用一对方括弧就是一维数组, 使用两对方括弧就是二维数组

        //遍历twoArray1数组中存储的数据
        System.out.println( twoArray1.length );         //3
        for (int i = 0; i < twoArray1.length; i++) {
            //twoArray1[0]元素是data1,  twoArray1[1]元素是data2,  twoArray1[2]元素是data3, twoArray1数组的每个元素又是一个一维数组名
//            System.out.println( twoArray1[i] );     //直接打印数组名会显示一串十六进制数, 这串十六进制数可以简单的看作是堆中数组的引用
            //可以继续遍历  twoArray1[i] 这个一维数组中的元素, 把twoArray1[i]看作是一个数组名
            for (int j = 0; j < twoArray1[i].length; j++) {
                System.out.print( twoArray1[i][j] + "  ");
            }
            System.out.println();
        }

        /*
            二维数组定义格式:
                数据类型 [][] 数组名 = new 数据类型[二维数组长度][];
         */
        int [][] twoArray2 = new int[10][];     //定义一个二维数组twoArray2,有10个元素, 每个元素是 int [] 类型的一维数组, twoArray2定义完之后,会给每个元素默认初始化为null

        //在定义二维数组时, 也可以指定一维数组的长度, 系统会给一维数组进行默认初始化
        int [][] twoArray3 = new int[5][10];    //定义二维数组twoArray3有5个元素, 每个元素是一个长度为10的一维数组
        for (int[] ints : twoArray3) {
            for (int xx : ints) {
                System.out.print( xx + "  ");
            }
            System.out.println();
        }

        //给二维数组元素赋值,只需要数据类型匹配即可, 即给towArray3数组元素赋值时,只需要赋值int[]类型的数组即可
        twoArray3[0] = data2;
        twoArray3[1] = data3;
        twoArray3[2] = new int[20];
        twoArray3[3] = new int[]{6,6,6,6,6,6,6};

        //调用Arrays.deepToString( 二维数组) 可以把二维数组的元素连接为字符串
        System.out.println(Arrays.deepToString(twoArray3));

    }
}
