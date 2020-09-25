package Map;

import java.util.*;

/**
 * @AlanLin 2020/7/6
 */
public class LearnHashMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap();
        map.put("id", "1001");
        map.put("name", "zhangsan");
        map.put("age", "23");
        //调用方法返回key的Set集合
        Set<String> set=map.keySet();

        for (String s : set) {
            System.out.print(s+"  ");
            System.out.println(map.get(s));
        }

        Collection<String> collection=map.values();
        for (String s : collection) {
            System.out.println(s);
        }

        Set<Map.Entry<String,String>> entries=map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }



    }
}
