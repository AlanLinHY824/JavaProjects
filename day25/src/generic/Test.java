package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @AlanLin 2020/7/6
 */
public class Test {
    public static void main(String[] args) {
        //语法格式：Goods<T> goods=new Goods();需要把T换为规定的类型
        //JDK1.8前，等号右边的<>必须写
        //Goods<Byte> goods=new Goods<Byte>();
        Goods<Byte> goods=new Goods();
        goods.setPrice(Byte.valueOf("3"));
        Goods<Integer> goods1=new Goods();
        goods1.setPrice(6);

        System.out.println(Goods.<GoodsStore>getCount(new GoodsStore()));

        List<? super Integer> list = new ArrayList<Number>();
        list.add(2);

        System.out.println(list.get(0));

        String ss=new String("123");

        List<? extends Object> list2 = new ArrayList<>();//在编译阶段，编译器只知道List中存储Number的子类
        //但是无法确定添加的对象与右侧创建的对象相同，所以无论往里面存任何类型的数据都是无法编译通过的
        //list2.add(ss);
        List<? super String> list3 = new ArrayList<>();
        //list3.add(2.5);
        System.out.println(list3);
    }
}
