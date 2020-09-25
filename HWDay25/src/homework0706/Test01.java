package homework0706;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @AlanLin 2020/7/6
 */
public class Test01 {
    public static void main(String[] args) {
        Map<Object,Object> num=new HashMap<>();
        for (int i = 0; i <=100 ; i++) {
            num.put("数字"+String.valueOf(i), i);
        }

        for (Object value : num.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Object,Object> entry:num.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        for (Object key:num.keySet()) {
            System.out.print(key+":");
            System.out.println(num.get(key));
        }


    }
}
