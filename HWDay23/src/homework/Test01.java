package homework;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @AlanLin 2020/6/29
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<Integer> c1=new ArrayList<>();
        ArrayList<Integer> c2=new ArrayList<>();

        c2.get(0);

        Integer i1=new Integer("2");

        //添加元素
        c1.add(1);
        c1.add(i1);
        c1.add(3);
        c1.add(5);

        //遍历
        for (Integer integer : c1) {
            System.out.print(integer+"  ");
        }
        System.out.println();

        //删除
        for (Iterator<Integer> iterator = c1.iterator(); iterator.hasNext(); ) {
            Integer x = iterator.next();
            if (x==2){
            iterator.remove();
            }
        }

        System.out.println(c1.size());
        System.out.println(c1.isEmpty());
        System.out.println(c1.contains(2));






    }
}
