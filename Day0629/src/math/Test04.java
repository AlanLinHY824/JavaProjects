package src.math;

import java.math.BigInteger;
import java.text.DecimalFormat;

/**
 * java.text.DecimalFormat对数字格式化,常用的格式符
 *  #   任意数字
 *  0   任意数字,不足的位数会补0
 *  ,   千分位
 *  .   小数点
 */
public class Test04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###.0000");
        String ss = df.format(1234.56);
        System.out.println(ss);           //1,234.5600

        BigInteger bigInteger=new BigInteger("4564646464646464");
        DecimalFormat decimalFormat=new DecimalFormat("##,###,#####.00");
        ss=decimalFormat.format(bigInteger);
        System.out.println(ss);
    }
}
