package Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @AlanLin 2020/6/30
 */
public class Test04 {
    public static void main(String[] args) {
        //创建TreeSet集合存储String字符串，通过构造方法指定比较器，根据字符串降序排序
        TreeSet<String> treeSet=new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("dd".compareTo("zz"));
        treeSet.add("jj");
        treeSet.add("dd");
        treeSet.add("mm");
        treeSet.add("xx");
        treeSet.add("mm");
        treeSet.add("oo");
        System.out.println(treeSet);//[xx, oo, mm, jj, dd]

        System.out.println(treeSet.contains("oo"));

        //2.如果在创建TreeSet集合时，没有在构造方法中指定Comparator，要求元素的类实现Comparable接口
        //String已经实现了Comparable接口
        TreeSet<String> treeSet1=new TreeSet<>();
        treeSet1.addAll(treeSet);
        System.out.println(treeSet1);//[dd, jj, mm, oo, xx]
        // 3.Iterator<E> descendingIterator() 返回一个逆序迭代器
        Iterator<String> stringIterator=treeSet1.descendingIterator();
        while (stringIterator.hasNext()){
            String ss=stringIterator.next();
            System.out.print(ss+"  ");
        }
        System.out.println();
        System.out.println(treeSet1);//元素没变，只是逆序迭代

        //4.NavigableSet<E> descendingSet() 返回逆序访问原来TreeSet集合的一个视图，并没有产生新的集合，操作的还是原来的集合
        NavigableSet<String> navigableSet=treeSet1.descendingSet();


        //5、返回第一个/最后一个元素
        System.out.println(treeSet1.first());
        System.out.println(treeSet1.last());
        System.out.println(navigableSet.first());
        //删除第一个/最后一个元素
        System.out.println(treeSet1.pollFirst());
        System.out.println(treeSet1.pollLast());
        System.out.println(treeSet1);




    }
}
