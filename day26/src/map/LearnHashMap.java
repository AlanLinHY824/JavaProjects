package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @AlanLin 2020/7/6
 */
public class LearnHashMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap();
        map.put("id", "1001");
        map.put("name", "zhangsan");
        map.put("age", "23");
        //Map中数据的遍历
        //使用keySet
        Set<String> set=map.keySet();
        for (String s : set) {
            System.out.print(s+"  ");
            System.out.println(map.get(s));
        }
        System.out.println("=======");
        //使用values
        Collection<String> collection=map.values();
        for (String s : collection) {
            System.out.println(s);
        }
        System.out.println("=======");
        //使用entrySet
        Set<Map.Entry<String,String>> entries=map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("=======");
        //常用方法
        System.out.println(map.size());///返回存储的键值对个数
        Map<String,String> stringMap=new HashMap<>();
        stringMap.put("code","123");
        stringMap.put("tel", "2312313");
        stringMap.putAll(map);//指定映射中将所有映射关系复制到此映射中
        System.out.println(stringMap.size());
        stringMap.remove("code");//删除key对应的键值对
        stringMap.remove("tel", "2312313");//删除对应键值对
        System.out.println(stringMap);
        stringMap.clear();//清楚所有键值对
        stringMap.size();
        System.out.println(map.containsKey("id"));//判断是否包含该键
        System.out.println(map.isEmpty());//判断集合是否为空
        System.out.println(stringMap.isEmpty());
    }
}
