package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Collection的基本操作
 * @AlanLin 2020/6/29
 */
public class Test01 {
    public static void main(String[] args) {
        //1)创建Collection集合
        //Collection在java中是一个接口，接口需要赋值实现类对象
        Collection collection=new ArrayList();

        //2)向集合中添加元素
        collection.add("hello");
        collection.add("world");
        collection.add(new Date());
        collection.add(123);//添加基本数据类型，系统会自动装箱，把对应的包对象添加到集合中
        //打印Collection对象，当前collection实例引用的是ArrayList对象，打印时，引用的是ArrayList对象的toString()方法，上面的add()也是ArrayList对象的方法
        System.out.println(collection.toString());

        //3、遍历集合中所有的元素，输入iter会生成foreach循环代码块
        for (Object o : collection) {
            System.out.println(o);
        }

        //4、判断是否包含指定的元素，调用contains方法
        System.out.println(collection.contains("hello"));//true
        System.out.println(collection.contains("hehe"));//false

        //5、删除集合中的元素，使用remove方法
        collection.remove("hello");
        System.out.println(collection);


    }
}
