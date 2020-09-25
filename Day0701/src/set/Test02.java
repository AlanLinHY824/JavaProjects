package set;

import java.util.*;

/**
 * 在数组中有一组QQ号 , String [] qqArray = {"4513", "84651","4651394", "978465","84651","4651394"}; 
 * 要求把QQ号存储到List集合, 去掉重复的元素
 */
public class Test02 {
    public static void main(String[] args) {
        String [] qqArray = {"4513", "84651","4651394", "978465","84651","4651394"};

        //定义List集合存储QQ号
        List<String> qqList = new ArrayList<>();
        //把qqArray数组中的元素添加到qqlist集合中, 去掉重复元素
        for (int i = 0; i < qqArray.length; i++) {
            //如果qqArray[i]元素在List集合中就不添加, 如果List集合不包含qqArray[i]就添加
            if ( !qqList.contains(qqArray[i]) ){
                qqList.add(qqArray[i]);
            }
        }
        System.out.println( qqList );
        qqList.clear();

        //把qqArray数组中的元素添加到Set集合集合中,可以把重复的元素去掉
        Set<String> set = new HashSet<>();
        for (String s : qqArray) {
            set.add(s);
        }
        qqList.addAll(set);     //把set集合所有的元素都添加到list中
        System.out.println( qqList );

        List<String> list = Arrays.asList(qqArray);
        Set<String> set2 = new HashSet<>(list);
        List<String> result = new ArrayList<>(set2);
        System.out.println(result);
    }
}
