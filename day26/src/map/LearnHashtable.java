package map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @AlanLin 2020/7/7
 */
public class LearnHashtable {
    public static void main(String[] args) {
        Map<String,String> map=new Hashtable<>();
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
    }
}
