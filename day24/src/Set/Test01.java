package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set的操作和Collection集合是一样的没有增加新的操作
 * @AlanLin 2020/6/30
 */
public class Test01 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();

        set.add("hello");
        set.add("123456");
        set.add("world");
        set.add("bjpowernode");
        set.add("good");

        System.out.println(set);
        //不允许存储重复元素
        set.add(new String("hello"));
        System.out.println(set);

        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains("hello"));
        System.out.println(set.contains("hehe"));

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String ss = iterator.next();
            if (ss.length()==5){
                iterator.remove();
            }
        }

        System.out.println(set);

    }
}
