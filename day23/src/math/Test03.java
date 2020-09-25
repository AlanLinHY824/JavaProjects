package math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * BighInterger,BigDecimal
 * 对于精度要求较高的场景使用
 * @AlanLin 2020/6/29
 */
public class Test03 {
    public static void main(String[] args) {
        BigInteger i1=new BigInteger("746574656456745646464166");
        BigInteger i2=new BigInteger("4354354343");
        //调用实例方法进行运算
        BigInteger i3=i1.add(i2);


        //小数相除时，可能会出现除不断的情况，会产生java.lang.ArithmeticException算术异常
        //小数相除时，一般会指定小数保留的位数，及尾数的处理方式
        BigDecimal d1= new BigDecimal("45646464654654.55465");
        BigDecimal d2= new BigDecimal("4564565464.6346546");
        System.out.println(d1.divide(d2,10, RoundingMode.HALF_DOWN));//最后一个参数的尾数的处理方式，RoundingMode后面的参数随便选择一个即可



    }
}
