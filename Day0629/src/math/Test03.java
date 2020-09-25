package src.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * BigInteger, BigDecimal
 *  对于精度要求比较高的场景使用
 */
public class Test03 {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("7984651798465138974651328465132");
        BigInteger i2 = new BigInteger("46519784651798465197846512");
        BigInteger i4= new BigInteger("1010101010101010101010101010101001");
        System.out.println(i4);
        //add()相加, subtract()相减, multiply()相乘,  divide()相除
        BigInteger i3 = i1.add(i2);
        System.out.println( i3 );

        System.out.println( i1.subtract(i2));
        System.out.println( i1.multiply(i2));
        System.out.println( i1.divide(i2));

        //注意:小数相除时, 可能 会出现除不断的情况
        BigDecimal d1 = new BigDecimal("7948651389465132894651324651.794651");
        BigDecimal d2 = new BigDecimal("798465132084651320.89465");

        //小数相除,如果除不断会产生java.lang.ArithmeticException算术异常,
        //小数相除时, 一般会指定小数保留的位数,及尾数的处理方式
        BigDecimal d3 = d1.divide(d2, 10, RoundingMode.HALF_UP);
        System.out.println( d3 );
    }
}
