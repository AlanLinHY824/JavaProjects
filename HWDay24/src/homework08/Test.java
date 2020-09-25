package homework08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 模拟生成一注随机的双色球号码.
 * 双色球分别红区与蓝区, 红区有6个1~33之间的数组成, 蓝区有1个1~16之间的数组成. 红区号码不重复
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("红区数字为:"+creatRedNum());
        System.out.println("蓝区数字为:"+createBlueNum());
    }

    public static List<Integer> createBlueNum() {
        int num;
        List<Integer> blue=new ArrayList<>();
        for (int i = 0; i <1 ;) {
            num=(int)(Math.random()*33+1);
            blue.add(num);
            i=blue.size();
        }
        return blue;
    }

    public static HashSet<Integer> creatRedNum() {
        int num=0;
        HashSet<Integer> red=new HashSet<>();
        for (int i = 0; i <7 ;) {
            num=(int)(Math.random()*33+1);
            red.add(num);
            i=red.size();
        }
        return red;
    }
}
