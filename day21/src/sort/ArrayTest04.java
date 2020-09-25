package sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 对象数组的排序
 *
 * @AlanLin 2020/6/23
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        Person[] data=new Person[50];

        //一般情况下，在使用对象数组时，会定义一个变量，记录数组中元素的个数

        int size=0;;

        //每次添加元素时，size变量+1
        data[size++]=new Person("张三", 21);  //size=1
        data[size++]=new Person("李四", 25);  //size=2
        data[size++]=new Person("王五", 20);  //size=3
        data[size++]=new Person("赵六", 19);  //size=4

        //void	sort(T[] a, Comparator c)
        //根据比较器c对对象进行比较


        // void	sort(T[] a, int fromIndex, int toIndex,Comparator c)

        //当前数组长度为50，只存储了4个对象，可以只比较0-3的元素

        Arrays.sort(data, 0, 3, new Comparator<Person>() {
            //在匿名内部类中接收比较的两个对象，返回一个整数
            //o1>o2返回正数。o1=o2返回0，o1<o2返回负数，对应升序排序
            //o1<o2返回正数。o1=o2返回0，o1>o2返回负数，对应降序排序
            //不需要关心o1和o2是谁，只需要记住以上的规则
            @Override
            public int compare(Person o1, Person o2) {
                //根据人的年龄排降序
                if (o1.age<o2.age){
                    return 1;
                }else if(o1.age>o2.age){
                    return -1;
                }else {
                return 0;
                }
            }
        });
        for (int i = 0; i <size ; i++) {
            System.out.println(data[i]);
        }

    }
}
