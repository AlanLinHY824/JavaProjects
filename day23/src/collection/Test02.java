package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合泛型
 * 集合迭代
 * @AlanLin 2020/6/29
 */
public class Test02 {
    public static void main(String[] args) {
        //1、通常情况下，在集合中只存储同一类型的数据，在创建集合时，通过泛型指定存储的元素类型
        //创建Collection集合存储String字符串
        Collection<String> collection=new ArrayList<>();//表示collection集合值存储字符串

        //添加元素时只能添加泛型指定类型的数据
        collection.add("jj");
        collection.add("dd");
        collection.add("xx");
        collection.add("xx");
        collection.add("oo");
        //collection.add(456);//添加的数据如果不是泛型指定的类型，则语法错误，这就是泛型的好处，在编一阶段进行数据类型检查
        System.out.println(collection);

        //判断
        System.out.println(collection.size());
        System.out.println(collection.contains("xx"));
        System.out.println(collection.isEmpty());

        //遍历
        for (String s : collection) {
            System.out.println(s);
        }

        /*
            迭代遍历
                调用iterator()方法返回一个Iterator迭代器，通过迭代器可以遍历集合的每个元素，刚刚获得迭代器后，游标指向第一个元素的前面
                hasNext()方法判断游标后面是否还有元素
                next()方法返回游标后面的元素，并把游标后移，当游标已经指向最后一个元素的后面，再调用next()方法的话就会产生异常
         */
        Iterator<String> myIterator = collection.iterator(); //Ctrl Alt V把表达值或者方法返回值赋值给局部变量
        //当hasNext()返回true，即游标后面还有元素时，就调用next()方法把游标后面的元素返回
        while (myIterator.hasNext()){
            String str=myIterator.next();
            System.out.print(str+" ");
        }
        //注意：循环结束，游标迭代器已经指向最后一个元素的后边了，name该迭代器就不能再用了，迭代器是一次性的，如果还想迭代，需要重新调用iterator()方法返回一个新的迭代器

        //remove(o)删除第一个匹配的元素
//        collection.remove("xx");
//        System.out.println(collection);
//        //删除所有的"xx"
////        while (collection.contains("xx")){
////            collection.remove("xx");
////        }
        //通过循环删除，需要遍历集合N多次
        //在删除Collection集合中多个元素时，经常采用迭代删除
        //迭代Collection集合时，输入itco生成迭代代码块
        //for循环的初始化表达式获得一个迭代器，for循环条件时迭代器hasNext方法为true表示游标后面还有元素
        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
            String txt = iterator.next();
            if ("xx".equals(txt)){
                iterator.remove();
                //collection.remove("xx");//计数器改变，导致以下异常
            }
        }
        System.out.println(collection);
        //在foreach循环期间，或iterator()迭代期间，调用了collection的add()添加元素、remove删除元素时，会产生java.util.ConcurrentModificationException异常
    }
}
