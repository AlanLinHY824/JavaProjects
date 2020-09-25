package set;

import java.util.Random;
import java.util.TreeSet;

/**
 * 模拟生成一注随机的双色球号码.
 * 双色球分别红区与蓝区, 红区有6个1~33之间的数组成, 蓝区有1个1~16之间的数组成. 红区号码不重复
 */
public class Test03 {
    public static void main(String[] args) {
        //双色球号码是随机的
        Random random = new Random();

        //红区号码不重复,由小到大排序,选择TreeSet集合存储
        TreeSet<Integer> treeSet = new TreeSet<>();
        //生成6个随机整数存储到treeSet集合中
        while ( treeSet.size() < 6 ){
            treeSet.add( random.nextInt(33) + 1 );
        }
        //蓝区
        int blue = random.nextInt(16) + 1;

        //打印
        System.out.println( "红区:" + treeSet + ",蓝色:" + blue );
    }
}
