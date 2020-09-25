package src.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合泛型
 * 集合迭代
 */
public class Test02 {
    public static void main(String[] args) {
        //1) 通常情况下,在集合中只存储同一类型的数据, 在创建集合时,通过泛型指定存储的元素类型
        //创建Collection集合存储String字符串
        Collection<String> collection = new ArrayList<>();

        //2) 添加元素,只能添加泛型指定类型的数据
        collection.add("jj");
        collection.add("dd");
        collection.add("xx");
        collection.add("xx");
        collection.add("jj");
        collection.add("dd");
//        collection.add(456);    //添加的数据如果不是泛型指定的类型,则语法错误,这就是泛型的好处,可以在编译阶段进行数据类型检查
        System.out.println( collection );   //[jj, dd, xx, xx, jj, dd]

        //判断
        System.out.println( collection.size() );    //6  元素的个数
        System.out.println( collection.contains("jj"));     //true
        System.out.println( collection.isEmpty() );     //false

        //foreach遍历, iter
        for (String s : collection) {
            System.out.println( s );
        }

        /*3) 迭代遍历
                调用iterator()方法返回一个Iterator迭代器,通过Iterator迭代器可以遍历集合的每个元素
                刚刚获得迭代器后, 游标指向第一个元素的前面
                hasNext()方法判断游标后面是否还有元素
                next()方法返回游标后面的元素, 把游标后移. 当游标已经指向最后一个元素的后面了,再调用next()方法会产生异常
         */
        Iterator<String> iterator1=collection.iterator();
        Iterator<String> myIterator = collection.iterator();    //快捷键Ctrl + Alt + V, 把表达式或者方法返回值赋值给局部变量
        Iterator<String> iterator2 = collection.iterator();
        //当hasNext()返回true,即游标后面还有元素时, 调用next()方法把游标后面的元素返回
        while ( myIterator.hasNext() ){
            String str = myIterator.next();
            System.out.print( str + "  ");
        }
        System.out.println();
        //注意: 循环结束,myIterator迭代器的游标已经指向最后一个元素的后面了, myIterator迭代器就无法再用了, 迭代器是一次性的, 如果还想迭代, 需要重新调用iterator()方法返回一个新的迭代器

        //remove(o)删除第一个匹配的元素
        collection.remove("jj");
        System.out.println(collection);     //[dd, xx, xx, jj, dd]
        //删除所有的xx
        while ( collection.contains("xx") ){
            collection.remove("xx");
        }
        System.out.println(collection);     //[dd, jj, dd]
        //通过循环删除,需要遍历集合N多次
        //在删除Collection集合中多个元素时,经常采用有迭代删除
        //在迭代Collection集合时, 可以输入 itco 生成迭代代码块
        //for循环初始化表达式获得一个迭代器, for条件是迭代器hasNext()为true表示游标后面还有元素
        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); ) {
            String txt = iterator.next();
            if ("dd".equals(txt) ){
                iterator.remove();      //迭代器删除
//                collection.remove("dd");  //java.util.ConcurrentModificationException异常
            }
        }
        System.out.println( collection );
        //注意: 在foreach循环期间,或者iterator()迭代期间, 调用collection的add()添加元素,remove(o)删除元素时, 可能会产生java.util.ConcurrentModificationException异常
    }
}
