package src.math;

/**
 * Math类
 */
public class Test01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println( Math.random() );    //生成[0,1)范围内的随机小数
        }

        System.out.println( Math.sqrt(100));    //平方根
        System.out.println( Math.cbrt(1000));   //立方根
        System.out.println( Math.pow(10, 3) );  //a的b次方

        System.out.println( Math.max(10, 20));      //返回较大的
        System.out.println( Math.min(3.14, 5.68));  //较小的
    }
}
