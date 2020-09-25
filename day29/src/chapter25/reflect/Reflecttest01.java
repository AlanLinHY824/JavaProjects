package chapter25.reflect;

import java.util.Date;

/**
 * 要操作一个类的字节码，首先要获取这个类的字节码，怎么获取java.lang.Class实例？
 *  三种方式
 *  1、Class.forName("完整类名")；
 *  2、对象.getClass();
 *  3、任何类型都有class属性，调用class属性即可
 * @AlanLin 2020/7/14
 */
public class Reflecttest01 {
    public static void main(String[] args) {
        /*
            第一种方式：Class.forName()
            1、静态方法
            2、方法的参数是一个字符串
            3、字符串需要一个完整类名
            4、完整类名必须包含包名
         */
        Class c1=null;
        Class c2=null;
        Class c3=null;
        Class c4=null;
        try {
            c1=Class.forName("java.lang.String");//c1代表String类的字节码文件（String.class)代表String类型
            c2=Class.forName("java.util.Date");
            c3=Class.forName("java.lang.Integer");
            c4=Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /*
            java中任何一个对象都有getclass()方法
         */
        String s="abc";
        Class<?> aClass = new Object().getClass();
        Class x=s.getClass();
        System.out.println(c1==x);//true，说明内存地址一样
        // String.class字节码文件只有一份，在类加载时存放到方法区
        Date date=new Date();
        Class y=date.getClass();
        System.out.println(c2==y);
        //第三种方式，java语言中任何一种类型，包括基本数据类型，都有class属性
        Class z=String.class;



    }
}
