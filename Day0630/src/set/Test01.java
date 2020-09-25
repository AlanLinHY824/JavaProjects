package src.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集合
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 创建Set集合存储String字符串,
        //通过泛型指定存储元素的类型, Set接口引用赋值实现类对象
        Set<String> set = new HashSet<>();

        //2)添加元素
        set.add("hello");
        set.add("123456");
        set.add("world");
        set.add("bjpowernode");
        set.add("good");

        //3)直接打印, 存储顺序与添加顺序可能不一样
        System.out.println( set );  //[world, 123456, hello, good, bjpowernode]

        //4) 不允许存储重复元素
        set.add("hello");
        set.add("123456");
        System.out.println( set );  //[world, 123456, hello, good, bjpowernode]

        //5)判断
        System.out.println( set.isEmpty());     //false
        System.out.println( set.size());        //5
        System.out.println( set.contains("hello"));     //true
        System.out.println( set.contains("hehe"));      //false

        //6)迭代
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String ss = iterator.next();
            if ( ss.length() <= 5 ){
                iterator.remove();
            }
        }
        System.out.println( set );      //[123456, bjpowernode]
    }
}
