package homework04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 4 定义集合存储20个不重复的[0,100)范围内的随机整数. 分别使用List与Set集合操作
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        //List集合实现
        List<Integer> list=new ArrayList<>();
        int num;
        for (int i = 0; i <20;) {
            num=(int)(Math.random()*100);
            if (!list.contains(num)){
                list.add(num);
                i++;
            }
        }
        System.out.println(list);
        //Set集合实现
        Set<Integer> integerSet=new HashSet<>();
        for (int i = 0; i <20;) {
            num=(int)(Math.random()*100);
            integerSet.add(num);
            i=integerSet.size();
        }
        System.out.println(integerSet);

    }
}
