package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 演示集合之间的操作
 */
public class Test02 {
    public static void main(String[] args) {
        //1) 创建Collection集合存储Integer整数
        Collection<Integer>  collection = new ArrayList<>();

        //2)添加元素
        collection.add( Integer.valueOf(123));
        collection.add( Integer.valueOf(789));
        collection.add( Integer.valueOf(456));
        collection.add( Integer.valueOf(123));
        //添加int基本类型整数,系统会自动装箱
        collection.add( 369 );
        collection.add( 147 );
        System.out.println( collection );   //[123, 789, 456, 123, 369, 147]

        //3)可以在已有的Collection集合基础 上创建新的Collection集合
        Collection<Integer> collection2 = new ArrayList<>(collection);
        System.out.println(collection2);    //[123, 789, 456, 123, 369, 147]

        Collection<Integer> collection3 = new ArrayList<>();
        //4)调用addAll( c ) 把参数c集合中所有的元素都添加到当前集合中
        collection3.addAll(collection);
        collection3.addAll(collection);
        System.out.println(collection3);
        //[123, 789, 456, 123, 369, 147, 123, 789, 456, 123, 369, 147]

        collection2.add(258);
        collection2.add(188);
        System.out.println(collection2); //[123, 789, 456, 123, 369, 147, 258, 188]

        //5)调用containsAll(c)判断当前集合中是否包含参数c集合中所有的元素
        System.out.println( collection2.containsAll(collection));

        //6) 调用removeAll( c) 会把在参数c集合中出现的元素都删除
//        collection2.removeAll(collection);   //遍历collection2集合中的元素,如果该元素在参数collection集合中就删除
//        System.out.println(collection2);    //[258, 188]

        //7) 调用retainAll( c ) 把删除当前集合中的元素,只保留在参数c集合中出现过的元素
        collection2.retainAll(collection);  //遍历collection集合中的元素,如果该元素在参数collection集合中就保留,  不在参数collection集合中就删除
        System.out.println( collection2 );  //[123, 789, 456, 123, 369, 147]

    }
}
