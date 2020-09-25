package src.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * TreeSet集合可以对元素进行排序
 */
public class Test03 {
    public static void main(String[] args) {
        //1 创建TreeSet集合存储String字符串, 通过构造方法指定Comparator比较器,根据字符串降序排序
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeSet.add("jj");
        treeSet.add("dd");
        treeSet.add("mm");
        treeSet.add("xx");
        treeSet.add("oo");
        treeSet.add("xx");
        treeSet.add("jj");
        System.out.println( treeSet );  //[xx, oo, mm, jj, dd]

        //2 如果在创建TreeSet集合时没有在构造方法中指定Comparator, 要求元素的类实现Comparable接口
        //创建TreeSet存储String字符串, String类已经实现了Comparable接口, 重写了compareTo()方法比较两个字符串大小,  如果第一个字符串比参数字符串大返回正数,对应升序排序
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.addAll(treeSet);   //把treeSet集合中所有的元素都添加到treeSet2中
        System.out.println( treeSet2);  //[dd, jj, mm, oo, xx]

        //3 descendingIterator() 返回逆序迭代器
        Iterator<String> stringIterator = treeSet2.descendingIterator();
        while ( stringIterator.hasNext() ){
            String ss = stringIterator.next();
            System.out.print( ss + "   ");
        }

        System.out.println();   //xx   oo   mm   jj   dd
        System.out.println( treeSet2 );     //[dd, jj, mm, oo, xx]

        //4 descendingSet()返回逆序访问原来TreeSet集合的一个视图, 注意,并没有生成新的集合
        NavigableSet<String> descendingSet = treeSet2.descendingSet();
        System.out.println( descendingSet );    //[xx, oo, mm, jj, dd]
        treeSet2.add("gg");
        System.out.println( descendingSet );    //[xx, oo, mm, jj, gg, dd]

        //5 返回第一个/最后一个元素
        System.out.println(treeSet2.first());   //dd
        System.out.println( treeSet2.last() );  //xx
        //删除第一个/最后一个
        System.out.println( treeSet2.pollFirst() ); //dd
        System.out.println( treeSet2.pollLast() );  //xx
        System.out.println( treeSet2 );     //[gg, jj, mm, oo]
    }
}
