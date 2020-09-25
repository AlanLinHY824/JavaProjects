package twodimension;

import java.util.Arrays;

/**
 * @AlanLin 2020/6/24
 */
public class Test01 {
    public static void main(String[] args) {
        int[] data=new int[10];
        int[] data1={1,2,3,4,5};
        int x=10;
        int y=20;
        int[] data2={x,y};

        int[][] twoArray1=new int[][]{data,data1,data2};
        //二维数组的每一个元素存储的都是一个一维数组的引用
        System.out.println(Arrays.toString(twoArray1));
        //二维数组的遍历
        for (int i = 0; i <twoArray1.length ; i++) {
            for (int j = 0; j <twoArray1[i].length ; j++) {
                System.out.print(twoArray1[i][j]+"  ");
            }
            System.out.println();
        }

        //二维数组定义格式：
        int[][] twoArray2=new int[10][];  //定义一个二维数组，有10个元素，每个元素是一个一位数组int[]，默认初始化为null

        //定义二维数组的时候也可以定义一维数组的长度，系统会给一位数组默认初始化
        int[][] twoArray3=new int[5][10];  //定义一个二维数组，有5个元素，每个元素是一个一位数组int[10]

        for (int[] ints:twoArray3) {
            for (int xx:ints) {
                System.out.print(xx+"  ");
            }
            System.out.println();
        }
        //给二位数组赋值时，只需要数据类型匹配即可，只需要赋值int[]类型的数组即可，长度不一定需要按照动态初始化长度赋值

        //调用Arrays.deepToStrong可以把二维数组连接为字符串
        twoArray3[1]=new int[8];
        System.out.println(Arrays.deepToString(twoArray3));


    }
}
