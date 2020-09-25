package wrapper;

/**
 * 包装类的常用方法
 * @AlanLin 2020/6/29
 */
public class Test03 {
    public static void main(String[] args) {
        Integer i1=new Integer(123);
        Integer i2=new Integer("456");

        i1.intValue();//将包装类转换为对应的基本类型
        /*
            1、整数、小数
         */



        /*
            2、static int compare(int x,int y)可以比较两个int整数的大小，如果第一个整数比第二个整数大，返回整数，相等返回0，
                Boolean类在比较时认为true>false
         */
        System.out.println(Integer.compare(10, 5));
        System.out.println(Boolean.compare(true, false));

        /*
            3、int compareTo(Integer anotherInteger) 所有包装类都实现了接口，重写了抽象方法，用于比较两个包装类对象的大小
            比较的是包装类对象的value属性的大小
         */
        System.out.println(i1.compareTo(i2));

        /*
            4、static int parseInt(String s)  把字符串转换为整数类型
            除Character外的包装类都可以做此转换
         */

        /*
            5、static Integer valueOf(int i)  JDK9后，建议用此方法创建包装类对象
                static String toHexString(int i)  转化为16进制
         */




    }
}
