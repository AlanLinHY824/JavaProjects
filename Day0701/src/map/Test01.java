package map;

import javax.swing.*;
import java.util.*;
import java.util.Map.Entry;     //导入 内部类


/**
 * 演示Map基本操作
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 创建Map集合存储<员工姓名,工资>, 第一个数据员工姓名是键,第二个数据工资是值
        //通过泛型指定键值的数据类型
        Map<String, Integer> map = new HashMap<>();

        //2) 调用put方法添加数据
        map.put("lisi", 8500);
        map.put("wangwu", 9000);
        map.put("zhaoliu", 5500);
        map.put("chenqi", 6500);
        map.put("zhuba", 3500);

        //3) 直接打印map, 实际调用HashMap的toString()方法
        System.out.println( map );
        //{lisi=8500, zhaoliu=5500, wangwu=9000, chenqi=6500, zhuba=3500}
        //当前Map实际引用的是HashMap, 存储的位置与添加位置可能不一样,在HashMap中,存储位置与键 的哈希码有关

        //4) 注意: Map的键不允许重复, Map的键是唯一的
        //在put()添加键值对时,如果键已存在, 会使用新的value值替换原来的值, 把原来的值返回; 如果是第一次添加,put()返回null
        Integer old = map.put("lisi", 9999);
        System.out.println( map );
        //{lisi=9999, zhaoliu=5500, wangwu=9000, chenqi=6500, zhuba=3500}
        System.out.println( old );      //8500

        //5) 判断
        //查看某个员工的工资, 可以调用get(key)返回键对应的值
        System.out.println( map.get("lisi") );      //9999  通过哈希值定位，比较key值是否相同，
        System.out.println( map.get("wangwu"));     //9000
        //get(key)返回键对应的值,如果键不存在返回null
        System.out.println( map.get("feifei") );    //null
        //判断是否存在zhangsan员工, 员工姓名是以键的身份存在的, 判断map的键中是否包含zhangsan
        System.out.println( map.containsKey("zhangsan"));   //false
        System.out.println( map.containsKey("zhaoliu"));    //true
        //判断是否有员工工资为10000元, 工资在map中是以值的身份存在的, 判断map的值是否包含10000
        System.out.println( map.containsValue(10000 ));     //false
        System.out.println( map.containsValue( 3500 ));     //true
        //查看键值对的数量
        System.out.println( map.size() );   //5
        System.out.println( map.isEmpty() );    //false

        //6遍历
        //查看所有员工的姓名, 可以返回所有键的集合
        Set<String> keyset = map.keySet();//这里实际创建的类就是KeySet，是HaspMap的内部类，实现了Set接口
        System.out.println(keyset);     //[lisi, zhaoliu, wangwu, chenqi, zhuba]
        //查看所有的工资, 可以返回所有值的集合
        Collection<Integer> values = map.values();
        System.out.println(values);     //[9999, 5500, 9000, 6500, 3500]
        //查看所有员工的工资, 可以返回所有键值对的集合, Map中一个键值对就是一个Entry, Entry的数据类型为: Map.Entry<String, Integer>,  Entry是Map接口中定义的一个内部接口
//        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println(entrySet);
        //[lisi=9999, zhaoliu=5500, wangwu=9000, chenqi=6500, zhuba=3500]

        //7 删除
        map.remove("lisi", 8500);   //从map中删除<lisi,8500>对, 要求键和值都必须匹配
        System.out.println(map);
        map.remove("lisi");         //只根据键删除,只要键匹配就把对应的键值对删除
        System.out.println(map);
        //{zhaoliu=5500, wangwu=9000, chenqi=6500, zhuba=3500}

        //8 替换, replace(key,newVAlue) 返回旧的value值
        old = map.replace("wangwu", 12345);//把wangwu的值替换为12345
        System.out.println(map);
        //{zhaoliu=5500, wangwu=12345, chenqi=6500, zhuba=3500}
        System.out.println(old);    //9000
        //注意:replace(key,value)替换前提是key这个键已经存在,
        old = map.replace("feifei", 666);
        System.out.println( map );
        System.out.println( old );      //null

        //9 仅仅是遍历, 可以输入iter使用foreach循环遍历键,值,或者是Entry
        for (String key : map.keySet()) {
            System.out.print( key + "\t");
        }
        System.out.println();

        //遍历所有的值
        for (Integer value : map.values()) {
            System.out.print( value + "\t");
        }
        System.out.println();

        //遍历所有的entry, 一个Entry就是一个键值对, 每个Entry有getKey()返回键, getValue()返回值
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println( entry.getKey() + " : " + entry.getValue() );
        }
        

        //根据一个Map创建另外一个Map
        Map<String,Integer> map2 = new HashMap<>(map);
        Map<String,Integer> map3 = new HashMap<>();
        map3.putAll( map );     //把map中所有的键值对都添加到map3中

        //10 注意: keySet(), values(), entrySet() 并没有生成新的集合, 从keySet(), values(), entrySet()集合中删除元素,实际上就是从Map集合中删除元素, 这些集合可以删除,但是不支持add()添加操作
        keyset = map.keySet();
        //删除keySet()集合中的元素
        for (Iterator<String> iterator = keyset.iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            if ( key.compareTo("z") > 0 ){
                iterator.remove();
            }
        }
        System.out.println(keyset);     //[wangwu, chenqi]
        //删除keySet()集合中的元素,实际上会把Map中的对应的键值对删除
        System.out.println( map );      //{wangwu=12345, chenqi=6500}

        values = map.values();  //AbstractCollection
        System.out.println(values);     //[12345, 6500]
        //删除values()集合中的元素
        for (Iterator<Integer> iterator = values.iterator(); iterator.hasNext(); ) {
            Integer vv = iterator.next();
            if ( vv.intValue() > 10000 ){
                iterator.remove();
            }
        }
        System.out.println(values);     //[6500]
        //删除values()集合中的元素,会把map中对应的键值对删除
        System.out.println( map );  //{chenqi=6500}

        System.out.println(map2);
        //{wangwu=12345, chenqi=6500, zhuba=3500, zhaoliu=5500}
        entrySet = map2.entrySet();

        //[wangwu=12345, chenqi=6500, zhuba=3500, zhaoliu=5500]
        for (Iterator<Entry<String, Integer>> iterator = entrySet.iterator(); iterator.hasNext(); ) {
            Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 6000){
                iterator.remove();
            }
        }
        System.out.println(entrySet);   //[wangwu=12345, chenqi=6500]
        //从entrySet()集合中删除元素,就是删除Map中对应的数据
        System.out.println(map2);       //{wangwu=12345, chenqi=6500}


    }
}
