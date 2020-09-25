package src.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Collection的基本操作
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 创建Collection集合
        //Collection在Java中是一个接口, 接口需要赋值实现类对象
        Collection collection = new ArrayList();

        //2) 向集合中添加元素, 调用add()方法, 只能添加引用类型的数据
        collection.add("hello");
        collection.add("world");
        collection.add(new Date() );
        //如果添加基本类型数据, 系统会先进行自动装箱,再把对应的包装类对象添加到集合中
        collection.add( 123 );

        //直接打印, 当前collection实际引用的是ArrayList对象, 打印collection时,调用的是ArrayList对象的toString()方法,  上面add()添加也是调用ArrayList对象的add()方法
        System.out.println(collection);

        //3) foreach循环遍历集合中所有的元素, 输入iter会生成foreach循环代码块
        for (Object o : collection) {
            System.out.println( o );
        }

        //4) 判断集合中是否包含指定的元素, 调用contains( )方法
        System.out.println( collection.contains("hello"));  //true
        System.out.println( collection.contains("hehe"));  //false

        //5) 删除集合中的元素, 调用remove(o)删除第一个匹配的元素
        collection.remove("hello");
        System.out.println(collection); //[world, Mon Jun 29 14:35:25 CST 2020, 123]
    }
}
