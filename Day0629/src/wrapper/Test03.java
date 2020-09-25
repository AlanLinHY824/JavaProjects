package src.wrapper;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * 包装类的常用方法
 */
public class Test03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(123);
        Integer i2 = new Integer("456");
        Double d1=new Double("1245.6");
        /*1 整数,小数从Number继承的一组方法,可以把包装类对象转换为基本类型
            byte byteValue()
            float floatValue()
            每个包装类都有一个value属性,保存包装类对象对应的基本类型的值, 即i1对象的value属性保存整数123, i2对象的value属性保存整数456, 从Number继承的这一组方法,把包装类对象转换为基本类型时,就是把value属性进行强制类型转换
         */
        byte bb = i1.byteValue();
        double dd = i1.doubleValue();


        /*2
            static int compare(int x, int y)  可以比较两个int整数的大小,如果第一个整数x比第二个整数y大返回正数, 相等返回0, 第二大返回负数
         */

        System.out.println( Integer.compare(10, 20));   //-1
        System.out.println( Double.compare(12.5, 3.6)); //1
        System.out.println( Boolean.compare(false, true));  //-1, 布尔比较时,认为true大于false

        /*3
           int compareTo(Integer anotherInteger)  所有的包装类都实现了Comparable接口,重写了Comparable接口的抽象方法compareTo(), 比较两个包装类对象的大小, 如果第一个包装类对象大返回正数, 相等返回0, 参数对象大返回负数.  同样包装类对象在比较大小时,也是比较包装类对象的value属性的大小
         */
        System.out.println( i1.compareTo(i2 ) );    //-1

        /*4
            static int parseInt(String s)  把字符串转换为int整数
         */
        int num = Integer.parseInt("741");
        double dddd  = Double.parseDouble("56.78");
        boolean flag = Boolean.parseBoolean("true");
        //不能把字符串直接转换为char字符

        /*5
            可以根据基本类型或者String字符串创建包装类对象, 从JDK9开始,建议采用这种形式创建包装类对象
            static Integer valueOf(int i)
            static Integer valueOf(String s)
         */
        Integer i3 = Integer.valueOf(456);
        Integer i4 = Integer.valueOf("7984");

        //把int整数转换为十六进制
        System.out.println( Integer.toHexString(1000));
        System.out.println( Integer.toBinaryString(100));
        System.out.println(Double.toHexString(45.6));
        String s=String.valueOf(i4);
        s=Integer.toString(i3);
    }
}
