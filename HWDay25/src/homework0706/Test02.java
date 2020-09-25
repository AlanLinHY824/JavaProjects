package homework0706;

import java.util.HashMap;
import java.util.Map;

/**
 * @AlanLin 2020/7/6
 */
public class Test02 {
    public static void main(String[] args) {
        Map<String,String> charMap=new HashMap<>();
        for (char i = 'a'; i <='z' ; i++) {
            charMap.put("字母"+i,Character.toString(i));
        }

        for (String value:charMap.values()) {
            System.out.print(value+"  ");
        }

        for (String key:charMap.keySet()) {
            System.out.print(key+":");
            System.out.println(charMap.get(key));
        }

        for (Map.Entry<String,String> entry:charMap.entrySet()) {
            System.out.print(entry.getKey()+":");
            System.out.println(entry.getValue());
        }
    }
}
