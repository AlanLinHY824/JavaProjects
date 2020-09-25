package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 学习HashMap的用法
 */
public class LearnHashMap {


    /**
     * 存放一个逻辑对象
     */
    public static void learn1(){
        //声明一个父类型的引用指向子类型的实例
        ///父类型 变量名称 = new 子类型();
        // key:String, value:String
        Map<String,String> personMap = new HashMap<>();
        personMap.put("id","1001");
        personMap.put("name","张三");
        personMap.put("age","21");

        //取key的集合
        Set<String> keySet = personMap.keySet();

        for(String key : keySet){
            String value = personMap.get(key);
            System.out.println(key + ":" + value);
        }
    }



    /**
     * 存放一个逻辑对象
     */
    public static void learn2(){

        Map<String,Object> map = new HashMap<>();

        map.put("id",1001);
        map.put("age",20);
        map.put("age","男");
        map.put("是否在校生",false);

        //取value的集合
         /*Collection<Object> values = map.values();

         for(Object value : values){

             System.out.println(value);

         }*/

         //取entry集合
        Set<Map.Entry<String,Object>> entrySet = map.entrySet();

        for(Map.Entry<String,Object> entry : entrySet){
            //取每一个entry的key和value
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



    }


}
