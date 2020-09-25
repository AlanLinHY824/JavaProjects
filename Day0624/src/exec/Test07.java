package exec;


/**
 * 定义方法, 实现int[] 数组元素的 乱 序
 */
public class Test07 {
    public static void main(String[] args) {
        int [] data = {11,22,33,44, 55};
        shuffle( data );
        System.out.println( Test04.toString(data));

    }

    //定义方法实现数组元素乱序
    public static void shuffle(int [] array ){
        //遍历数组元素, 把该元素与另外一个元素交换
        for (int i = 0; i < array.length; i++) {
            //array[i] 与 array[x]元素交换,  x索引值是随机的
            int x = (int)(Math.random() * array.length);    //生成[0, array.length)范围内的随机整数
            int t = array[i];
            array[i] = array[x];
            array[x] = t;
        }
    }
}
