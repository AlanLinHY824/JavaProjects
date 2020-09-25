package src.wrapper;

/**
 * 创建包装类对象
 */
public class Test02 {
    public static void main(String[] args) {
        //1) 所有的包装类都可以根据基本类型创建包装类对象
        //从JDK9开始, 构造方法就已过时, 调用过时的方法时,会在方法中间添加一条横线
        Integer i1 = new Integer(456);
        Double d1 = new Double(3.14);
        Character c1 = new Character('A');
        Boolean b1 = new Boolean(false);


        //2) 除了Character外,其他的包装类可以根据String字符串创建包装类对象
        Integer i2 = new Integer("789");
        Double d2 = new Double("45.78");
        Boolean b2 = new Boolean("false");
        //注意: 字符串要符合数字格式
//        i2 = new Integer("adb");    //java.lang.NumberFormatException,数字格式异常

        //3) 所有的包装类都有TYPE属性,返回对应的基本类型
        System.out.println( Integer.TYPE);
        System.out.println( Double.TYPE);
        System.out.println( Character.TYPE);
        System.out.println( Boolean.TYPE);

        //4) 对于数值类型,有最大值,最小值
        System.out.println( Integer.MAX_VALUE);
        System.out.println( Integer.MIN_VALUE );
    }
}
