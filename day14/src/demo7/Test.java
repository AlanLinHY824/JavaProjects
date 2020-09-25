package demo7;

import static demo7.MyClass.y;

/**
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        //注意：要在一个类中直接使用其他类中的静态变量，则必须实现静态导入
        System.out.println(y);
    }
}
