package wrapper;

/**
 * @AlanLin 2020/6/29
 */
public class Test02 {
    public static void main(String[] args) {
        //1.所有包装类都可以根据基本数据类型创建包装类对象
        //从JDK9开始，构造方法已经过时，调用已过时的方法时，会在方法中添加一条线
        Integer i1=new Integer(456);
        Double d1=new Double(3.14);
        Character c1=new Character('a');
        Boolean b1=new Boolean(false);

        //2.除了Character以外其他的包装类可以根据String字符串创建包装类对象
        Integer i2=new Integer("123");
        Double d2=new Double("12.5");
        Boolean b2=new Boolean("false");


        //3.所有的包装类都有type属性，返回对应的基本数据类型
        System.out.println(Integer.TYPE);

        //4.对于数值类型，有最大值，最小值
        System.out.println(Short.MAX_VALUE);



    }
}
