package homework04;

/**
 * 定义方法, 把int []类型数组元素连接为一个字符串
 * int [] data = {11,22,33,44};
 * String text = toString( data );
 * 打印text要求显示: [11,22,33,44]
 * @AlanLin 2020/6/23
 */
public class Test {
    public static void main(String[] args) {
        int [] data = {11,22,33,44};
        String text=toString(data);
        System.out.println(text);
    }

    public static String toString(int[] data) {
        String str="[";
        for (int i = 0; i <data.length ; i++) {
            str+=i==data.length-1?data[i]:data[i]+",";
        }
        return str+"]";
    }
}
