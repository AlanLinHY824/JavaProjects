package Map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @AlanLin 2020/7/4
 */
public class Test02 {
    public static void main(String[] args) {
        //创建TreeMap存储员工姓名和工资
        TreeMap<String,Integer> treeMap=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.put("lisi", 10000);
        treeMap.put("zhangsan", 12000);
        treeMap.put("wangwu", 11000);
        treeMap.put("zhaoliu", 15000);


    }
}
