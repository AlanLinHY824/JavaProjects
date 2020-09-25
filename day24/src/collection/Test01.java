package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @AlanLin 2020/6/30
 */
public class Test01 {
    public static void main(String[] args) {
        //创建集合存储Integer整型
        Collection<Integer> collection=new ArrayList<>();

        //添加元素
        collection.add(Integer.valueOf(45));
        collection.add(Integer.valueOf(12));
        collection.add(Integer.valueOf(32));
        collection.add(Integer.valueOf(12));
        collection.add(Integer.valueOf(46));
        //添加基本类型的话系统会自动装箱
        //在已有的collection集合的基础上创建新的Collection集合
        Collection<Integer> collection2=new ArrayList<>(collection);
        System.out.println(collection2);

        //addAll(c)把集合c中的元素添加到集合中
        Collection<Integer> collection3=new ArrayList<>(collection);
        collection3.addAll(collection2);
        System.out.println(collection3);

        //containsAll(c)判断当前集合中是否包含参数c集合中所有的元素
        collection2.add(78);
        collection2.add(0);
        System.out.println(collection2.containsAll(collection));

//        //调用remove(c)在调用集合中把参数c集合中出现的元素都删除
//        collection2.removeAll(collection);
//        System.out.println(collection2);

        //retainAll（c）删除当前集合中的元素，只保留在参数c集合中出现过的元素
        collection2.retainAll(collection);
        System.out.println(collection2);



    }
}
