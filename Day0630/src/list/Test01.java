package src.list;

import java.util.*;

/**
 * List基本操作
 *  1) List继承了Collection,
 *  2) List存储顺序与添加顺序一致, 允许存储重复元素
 *  3) 为每个元素指定了索引值,增加了针对索引值的操作
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 创建List集合存储String字符串
        //通过泛型指定元素类型为String
        //List接口需要赋值实现类对象
        List<String> list = new ArrayList<>();

        //2) Collection的操作List都有
        list.add("jj");
        list.add("mm");
        list.add("dd");
        list.add("jj");
        list.add("mm");
        list.add("dd");
        list.add("mm");

        //3) 直接打印, List存储顺序与添加顺序一致, 允许存储重复元素
        System.out.println( list );     //[jj, mm, dd, jj, mm, dd, mm]
        System.out.println( list.size() );      //7
        System.out.println( list.contains("jj"));   //true
        System.out.println( list.contains("DD"));   //false
        list.remove("jj");
        System.out.println(list);   //[mm, dd, jj, mm, dd, mm]
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            if ("mm".equals(next)){
                iterator.remove();
            }
        }
        for (String s : list) {
            System.out.print( s + "  ");
        }
        System.out.println();       //dd  jj  dd

        //4为每个元素指定了索引值,增加了针对索引值的操作
        //4.1 add( index,  o) 在指定的位置添加元素
        list.add(0, "xx");
        System.out.println(list);
        //4.2 remove( index )删除指定位置的元素,会把删除 的元素返回
        String removed = list.remove(1);
        System.out.println(removed);        //dd
        System.out.println( list );     //[xx, jj, dd]
        //4.3 修改指定位置的元素 set(index, o)
        list.set(1, "JJ");
        System.out.println( list );     //[xx, JJ, dd]
        //4.4 返回指定位置的元素 get(index)
        System.out.println( list.get(0));   //xx
        //4.5 通过for循环遍历集合中的每个元素
        for (int i = 0; i < list.size(); i++) {
            System.out.print( list.get(i) + "\t");
        }
        System.out.println();
        //****不管是数组,String字符串还是List集合,所有涉及索引值的位置,索引值都不能越界

        //4.6 返回元素在集合中第一次出现的索引值
        System.out.println( list.indexOf("xx"));    //0
        System.out.println( list.indexOf("yy"));    //-1, 负数表示不存在

        //5) List集合有listIterator() 方法返回ListIterator迭代, ListIterator迭代器继承了Iterator, 不仅可以向后迭代,还可以向前迭代, 不仅可以删除 ,还可以添加或者修改
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            String ss = stringListIterator.next();
            if ("xx".equals(ss)){
                stringListIterator.set("xxoo");     //修改集合中的元素
            }else if ("JJ".equals(ss)){
                stringListIterator.add("mm");       //添加
            }else if ("dd".equals(ss)){
                stringListIterator.remove();        //删除
            }
        }
        System.out.println( list );     //[xxoo, JJ, mm ]
        //上面循环结束后, stringListIterator 迭代器的游标指向最后一个元素的后面, 还可以向前迭代
        while (stringListIterator.hasPrevious() ){
            String previous = stringListIterator.previous();
            System.out.print( previous + "\t");
        }
        System.out.println();

        //6) List在JDK8中新增 了sort(Comparator)排序功能
        list.add("yy");
        list.add("gg");
        list.add("mm");
        list.add("qq");
        System.out.println(list);   //[xxoo, JJ, mm, yy, gg, mm, qq]
        //调用sort(Comaprator)排序, 通过Comparator参数指定比较规则
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);    //如果o1大返回正数, 对应升序排序
            }
        });
        System.out.println( list );     //[JJ, gg, mm, mm, qq, xxoo, yy]

        //7) subList(int fromIndex, int toIndex) 返回List集合上[ fromIndex, toIndex)范围内的一个视图, 视图是操作List集合部分元素的一种方式
        List<String> subList = list.subList(1, 5);
        System.out.println( subList );  //[gg, mm, mm, qq]
        //注意: subList视图并没有创建新的List集合, 通过subList也是操作的原来List集合,同样对原来List集合指定范围元素的修改也会影响subList
        list.set(2, "MMMMM");       //通过List集合操作数据
        System.out.println( subList );  //[gg, MMMMM, mm, qq]
        subList.remove(0);
        System.out.println( subList );  //[MMMMM, mm, qq]
        System.out.println( list );     //[JJ, MMMMM, mm, qq, xxoo, yy]

        //8) toArray(T[] a) 把集合中的元素复制到数组中
        String [] strArray = new String[list.size()];       //创建一个新的数组
        list.toArray(strArray);     //把集合中的元素复制到数组中
        System.out.println( Arrays.toString(strArray) );
        //[JJ, MMMMM, mm, qq, xxoo, yy]

        // Arrays.asList()可以把数组的元素转换为List集合, asList()就是使用List集合查看数组中的元素
        List<String> asList = Arrays.asList(strArray);
        //注意: asList()方法返回的List集合是定长的, 不支持add()/remove()删除操作, 返回的List集合是Arrays工具类的一个内部类, 不是java.util.ArrayList
//        asList.add("xx");   //java.lang.UnsupportedOperationException不支持该操作
        //修改asList集合中的元素就是修改数组中的元素
        asList.set(0, "hehe");
        System.out.println( asList );
        System.out.println( Arrays.toString(strArray) );

    }
}
