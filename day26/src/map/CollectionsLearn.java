package map;

import java.util.*;

/**
 * @AlanLin 2020/7/7
 */
public class CollectionsLearn {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        List<String> list2= new ArrayList<>();

        HashSet<String> set=new HashSet<>();
        //1、addAll (Collection<? super T> c, T... elements) 向Collection集合中添加一系列元素
        Collections.addAll(list,"a","b","c");
        Collections.addAll(list2,"0","1","2");
        Collections.addAll(set, "2321","3123","12321");
        System.out.println(list);
        System.out.println(set);
        //2、copy(destList,srcList) 用srcList中的元素，覆盖掉destList对应位置上的元素
        Collections.copy(list, list2);//源List的size小于10的话直接用List的get和set逐个覆盖，大于等10就用迭代器取值和覆盖
        System.out.println(list);

        //3、emptyList()  返回一个空List（常量），在使用空List时可以节省空间
        System.out.println(Collections.emptyList());//[]
        //4、singleton(T o) 使用指定元素替换指定列表中的所有元素,返回一个只包含指定对象的不可变List
        Collections.singletonList("数据库里没有集合");
        Collections.fill(list, "0");
        //5、replaceAll(List<T> list, T oldVal, T newVal) 使用另一个值替换列表中出现的所有某一指定值。

        //6、sort(List<T> list)
        List<Integer> list3= new ArrayList<>();
        Collections.addAll(list3, 5,3,6,7,4,2,5,6);
        Collections.sort(list3);//根据元素自然顺序排序，要求元素已经实现Comparable接口

//        System.out.println(list3);
//        Collections.reverse(list3);//7、将指定List中的元素进行翻转
//        System.out.println(list3);
        //当在sort方法中指定比较器的时候，指定比较器的方法要优先于元素的自然顺序
        Collections.sort(list3,Collections.reverseOrder(null));//Collections.reverseOrder(null)可以将自然顺序翻转并返回
        System.out.println(list3);
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Collections.sort(list3,Collections.reverseOrder(comparator));//8、对指定比较器规定的顺序进行翻转并返回
        System.out.println(list3);

        Collections.reverseOrder();//9、返回一个比较器，这个比较器会将元素自然顺序进行翻转
        Collections.sort(list3,Collections.reverseOrder());




    }
}
