package src.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合存储整数
 */
public class Test03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //自动装箱
        list.add(123);
        list.add(456);
        list.add(798);
        System.out.println( list );     //[123, 456, 798]

        //删除集合中的123元素
//        list.remove(123);   //java.lang.IndexOutOfBoundsException索引值越界异常,
//        List集合有remove(Object) 删除集合中第一个匹配的元素 , remove(int)删除指定索引
//        值的元素 两个方法的重载, 在调用remove(123)时, 选择最匹配的remove( int )方法执
//        行, 删除索引值是123的元素, 越界
        list.remove(Integer.valueOf(123) );
        System.out.println( list );

    }
}
