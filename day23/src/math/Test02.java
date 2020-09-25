package math;

import java.util.Random;

/**
 * java.util.Random()专门生成随机数
 * @AlanLin 2020/6/29
 */
public class Test02 {
    public static void main(String[] args) {
        //创建对象
        Random random =new Random();

        random.nextDouble();//随机生成小数
        random.nextInt();
        random.nextInt(100);//指定随机数上限（取不到上限）


        //指定随机数的种子，种子相同生成的随机数序列一样

        Random random1=new Random(123456789);
        for (int i = 0; i <10 ; i++) {
            System.out.println(random1.nextDouble());
        }


    }
}
