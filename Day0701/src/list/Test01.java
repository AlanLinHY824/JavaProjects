package list;

import java.util.*;

/**
 * 生成10个[1, 100]范围的整数保存到List集合中;  对List集合中的整数降序排序;  迭代删除所有小于50的元素
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 创建List集合存储整数
        List<Integer> list = new ArrayList<>();

        //2) 向集合中添加10个随机整数
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);  //返回[0,100)范围内的整数
            list.add( num + 1 );
        }
        System.out.println( list );

        //对List集合中的整数降序排序
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);    //o2大返回正数,对应降序
            }
        });
        System.out.println( list );

        //迭代删除所有小于50的元素
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if ( next.intValue() < 50 ){
                iterator.remove();
            }
        }
        System.out.println( list );
    }
}
