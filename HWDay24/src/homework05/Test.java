package homework05;

import java.util.LinkedList;
import java.util.List;

/**
 * 在数组中有一组QQ号 , String [] qqArray = {“4513”, “84651”,”4651394”, “978465”,“84651”,”4651394”};
 * 要求把QQ号存储到List集合, 去掉重复的元素
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        String [] qqArray = {"4513","84651","4651394","978465","84651","4651394"};
        List<String> stringList= new LinkedList<>();
        for (String s : qqArray) {
            if (!stringList.contains(s)) {
                stringList.add(s);
            }
        }
        System.out.println(stringList);
    }
}
