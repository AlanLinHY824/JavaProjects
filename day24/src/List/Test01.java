package List;

import java.util.*;

/**
 * List基本操作
 * 1）List继承了Collection
 * 2)为每个元素增加了索引值，增加了针对索引值的操作
 * @AlanLin 2020/6/30
 */
public class Test01 {
    public static void main(String[] args) {
        //创建List集合存储字符串
        List<String> list=new ArrayList<>();

        //添加
        list.add("jj");
        list.add("mm");
        list.add("dd");
        list.add("jj");
        list.add("mm");
        list.add("dd");
        list.add("mm");

        //Lsit存储数据与添加顺序一致，允许存储重复元素
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("jj"));
        System.out.println(list.contains("DD"));
        list.remove("jj");
        System.out.println(list);

        //为每个元素添加了索引值，增加了针对索引值的操作
        //add(index,o)
        list.add(0,"xx");
        System.out.println(list);

        //删除指定位置的元素，会把删除的元素返回
        String r=list.remove(1);
        list.remove(1);

        //修改指定位置的元素
        System.out.println("修改方法"+list.set(1, "JJ"));
        System.out.println(list);
        //返回指定位置的元素
        System.out.println(list.get(0));
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();
        //注意索引值不能越界



        //返回元素在集合中第一次出现的索引值
        System.out.println(list.indexOf("xx"));//0
        System.out.println(list.indexOf("yy"));//-1 负数表示不存在

        //List集合有一个ListIterator<E> listIterator(int index)  方法返回ListIterator迭代器，继承了Iterator，不仅可以向后迭代还可以向前迭代，不仅可以删除，还可以添加或修改
        ListIterator<String> stringListIterator=list.listIterator();
        while (stringListIterator.hasNext()){
            String ss=stringListIterator.next();
        }



        //向后迭代结束后，stringListIterator游标指向最后一个元素的后面，还可以向前迭代
        while (stringListIterator.hasPrevious()){
            String p=stringListIterator.previous();
            System.out.print(p+"  ");
        }
        System.out.println();


        //List在JDK8中新增了sort排序功能
        list.add("yy");
        list.add("gg");
        list.add("mm");
        list.add("qq");
        System.out.println(list);

        //调用sort(Comparator)，通过接口指定比较贵重
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        //sublist可以返回指定范围内的一个视图，视图是操作List集合部分元素的一种方式
        List<String> subList = list.subList(1, 5);
        System.out.println(subList);
        //注意subList视图并没有创建新的List集合，通过subList也是操作原来的List集合，同样对原来的List集合进行修改也会影响subList
        list.set(2, "ssss");
        System.out.println(subList);
        subList.remove(0);
        System.out.println(subList);
        System.out.println(list);

        //toArray(T[] a)把集合中的元素复制到数组中，数组和集合互不关联
        String[] strings=new String[list.size()];
        list.toArray(strings);
        System.out.println(Arrays.toString(strings));
        //Arrays.asList()可以把数组元素转换为List集合
        List<String> asList = Arrays.asList(strings);
        //asList()方法返回的List集合是定长的，不支持add()/remove()操作，返回的List集合是Arrays工具类的内部类，提供了修改查看List集合元素的另一种方法
        //修改asList里的元素就是修改数组中的元素
        asList.set(0, "hh");
        System.out.println(asList);
        System.out.println(Arrays.toString(strings));




    }
}
