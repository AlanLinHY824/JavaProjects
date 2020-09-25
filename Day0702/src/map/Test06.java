package map;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * TreeMap可以根据键排序
 *  只能根据键排序,不能根据值排序
 */
public class Test06 {
    public static void main(String[] args) {
        //1) 创建TreeMap保存<员工姓名,工资> , 通过构造方法指定根据姓名降序排序
        TreeMap<String,Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.put("lisi", 9000);
        treeMap.put("wangwu", 4000);
        treeMap.put("zhaoliu", 6000);
        treeMap.put("chenqi", 8000);
        treeMap.put("zhuba", 5000);
        treeMap.put("zhangsan", 3000);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry);
        }

        //2)如果创建TreeMap时,没有在构造方法指定Comparator比较器,要求元素的类实现Comparable接口, 存储<员工姓名,工资>, 键员工姓名是String字符串, String类已经实现了Comparable接口
        TreeMap<String,Integer> treeMap2 = new TreeMap<>();
        treeMap2.putAll( treeMap);  //把treeMap所有的键值对都添加到treeMap2中
        System.out.println("--------------------------------------");
        for (Map.Entry<String, Integer> entry : treeMap2.entrySet()) {
            System.out.println(entry);
        }

        //3) TreeMap新增的操作
        //返回逆序Map
        NavigableMap<String, Integer> descendingMap = treeMap2.descendingMap();
        System.out.println("--------------descending------------");
        for (Map.Entry<String, Integer> entry : descendingMap.entrySet()) {
            System.out.println(entry);
        }

        //获得第一个/最后一个
        Map.Entry<String, Integer> firstEntry = treeMap2.firstEntry();
        System.out.println("first: " + firstEntry);
        Map.Entry<String, Integer> lastEntry = treeMap2.lastEntry();
        System.out.println("last: " + lastEntry);

        //删除第一个/删除最后一个
        Map.Entry<String, Integer> polledFirst = treeMap2.pollFirstEntry();
        Map.Entry<String, Integer> polledLast = treeMap2.pollLastEntry();
        for (Map.Entry<String, Integer> entry : treeMap2.entrySet()) {
            System.out.println(entry);
        }
    }
}
