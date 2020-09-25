package math;

import java.text.DecimalFormat;

/**
 * java.text.DecimalFormat  对数字进行格式化，常用的格式符：
 * #  任意数字
 * 0  任意数字，不足的位数用0补足
 * ,  千分位
 * .  小数点
 *
 * @AlanLin 2020/6/29
 */
public class Test04 {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("###,###.0000");
        String ss=df.format(45564.45);
        System.out.println(ss);
    }
}
