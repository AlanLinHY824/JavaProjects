package src.math;

import java.util.Random;

/**
 * java.util.Random专门生成随机数
 */
public class Test02 {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();

        //生成随机小数
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextDouble() );
        }

        //生成随机整数
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextInt() );
        }

        //生成[0, limit) 范围内的随机整数,
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextInt(100) );
        }

        //指定随机数的种子, 种子相同生成的随机数序列是一样的
        Random random2 = new Random(123456789);
        for (int i = 0; i < 10; i++) {
            System.out.println( random2.nextDouble());
        }
    }
}
