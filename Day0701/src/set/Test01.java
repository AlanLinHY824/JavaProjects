package set;

import java.util.*;

/**
 * 定义集合存储20个不重复的[0,100)范围内的随机整数. 分别使用List与Set集合操作
 */
public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();   //创建随机数对象

        //1 使用List集合存储
        List<Integer> list = new ArrayList<>();
        //当集合中元素的数量不足10个时就添加
        while ( list.size() < 10 ){
            int num = random.nextInt(100);  //生成[0,100)范围内的随机整数
            //如果list集合不包含num,就添加
            if ( !list.contains(num) ) {
                list.add( num );
            }
        }
        System.out.println( list );

        //2 使用Set集合存储
        Set<Integer> set = new HashSet<>();
        while ( set.size() < 10 ){
            set.add( random.nextInt(100) );
        }
        System.out.println( set );
    }
}
