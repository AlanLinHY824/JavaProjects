package arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 对象数组的排序
 */
public class Test02 {
    public static void main(String[] args) {
        Person [] data = new Person[50];
        int size = 0;

        data[size++] = new Person("lisi", 25);
        data[size++] = new Person("wangwu", 22);
        data[size++] = new Person("zhaoliu", 27);
        data[size++] = new Person("chenqi", 25);
        data[size++] = new Person("zhuba", 23);
        data[size++] = new Person("feifei", 26);
        data[size++] = new Person("feifei", 26);

        //sort(T[] a, Comparator c) 给对象数组a中所有的元素进行排序, 根据Commparator比较器来比较大小
        //sort(T[] a, int fromIndex, int toIndex, Comparator c) 给对象数组a中 [fromIndex, toIndex) 范围内的元素进行排序, 使用Comparator比较器比较大小
        //当前对象数组data长度是50, 只存储了size个元素, 就可以给data数组中[0, size)范围内的元素进行排序, 通过Comparator指定比较规则
        Arrays.sort(data, 0, size, new Comparator<Person>() {
            //在Comparator接口的匿名内部类中重写compare抽象方法, compare方法接收两个比较大小的对象, 返回一个整数, 对于同学们来说,只需要记住比较规则即可:
            // 如果o1大于o2返回正数, o1等于o2返回0, o1小于o2返回负数 对应升序排序
            // 如果o1大于o2返回负数, o1等于o2返回0, o1小于o2返回正数 对应降序排序
            @Override
            public int compare(Person o1, Person o2) {
                //根据人的年龄降序排序
                if ( o1.age < o2.age ){
                    return  1;
                }else if ( o1.age == o2.age ) {
                    return 0;
                }else {
                    return -1;
                }
            }
        });
        System.out.println("----------根据人的年龄降序------------");
        for (int i = 0; i < size; i++) {
            System.out.println( data[i]);
        }

        //根据人的年龄升序
        Arrays.sort(data, 0, size, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;     //o1年龄大返回正数
            }
        });
        System.out.println("----------根据人的年龄升序------------");
        for (int i = 0; i < size; i++) {
            System.out.println( data[i]);
        }

        //Arrays.binarySearch(data, new Person("lisi", 25));//要查找的类必须实现Comparable接口
    }
}
