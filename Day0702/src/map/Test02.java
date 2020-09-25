package map;

import java.util.HashMap;
import java.util.Map;

/**
 * 统计 字符串中每个字符出现的次数
 */
public class Test02 {
    public static void main(String[] args) {
        String text = "asadasfsfasfasfsafsffsfjsakfjsljfaljfdsljfkgjjhgjfsdaklgjkfl";

        //可以定义Map保存<字符, 次数>
        Map<Character, Integer> map = new HashMap<>();

        //遍历字符串的每个字符
        for (int i = 0; i < text.length(); i++) {
            char cc = text.charAt(i);
//            System.out.println(cc);
            //字符在map中是以键的身份存在的, 如果map的键不包含字符cc,说明字符cc是第一次出现
            if( !map.containsKey(cc) ){
                map.put(cc, 1);
            }else {
                //map的键包含字符cc,即cc字符不是第一次出现
                Integer count = map.get(cc);    //把cc之前出现的次数取出来
                //把次数加1再保存到map中去
                map.replace(cc, count + 1 );
            }
        }

        //打印结果
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println( entry.getKey() + " : " + entry.getValue());
        }
    }
}
