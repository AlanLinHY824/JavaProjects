package homework01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 1 生成10个[1, 100]范围的整数保存到List集合中;  对List集合中的整数降序排序;  迭代删除所有小于50的元素
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i,(int)(Math.random()*100+1));
        }
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer next = iterator.next();
            if (next>50){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
