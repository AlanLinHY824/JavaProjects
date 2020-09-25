package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * collection存储自定义类型对象
 */
public class Test01 {
    public static void main(String[] args) {
        //1 创建collection集合存储Student对象
        Collection<Student> collection = new ArrayList<>();

        //2) 添加元素
        collection.add(new Student("101", "lisi", 98));
        collection.add(new Student("102", "wangwu", 58));
        collection.add(new Student("103", "zhaoliu", 68));
        collection.add(new Student("104", "chenqi", 88));
        collection.add(new Student("105", "zhuba", 78));
        collection.add(new Student("106", "feifei", 28));

        //3 foreach循环遍历
        for (Student student : collection) {
            System.out.println( student );
        }

        //4 判断
        System.out.println( collection.size() );    //6
        Student stu = new Student("105", "zhuba", 78);
        //判断集合中是否包含stu对象.  collection实际引用的是ArrayList实现类对象, 通过接口引用调用抽象方法时,实际执行的是实现类对象的方法,称为接口多态. 即通过collection调用contains(o)方法时, 实际执行的是ArrayList对象的contains()方法, 在Arraylist集合中的contains(o)方法中判断是否包含o元素时,需要调用元素的equals()方法
        System.out.println( collection.contains(stu) );

        //注意: 当前collection存储的是Student对象, contains(Student)方法只能判断集合是否包含指定的student对象, 不能直接contains( 学生姓名 )
        //需求 判断collection集合中是否包含zhangsan同学,即是否存在姓名为zhangsan的同学.
        //需要遍历集合中所有的Student对象,如果有某个Student对象的姓名也是zhangsan表示存在,所有学生的姓名都不是xhangsan说明不存在
        boolean exist = false;  //定义存在标志
        String name = "zhangsan";
        for (Student student : collection) {
            if (name.equals(student.name)){
                exist = true;
                break;
            }
        }
        if (exist){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }

        //5删除第一个匹配的学生
        collection.remove(stu);

        //6迭代删除所有匹配的元素
        for (Iterator<Student> iterator = collection.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if ( student.score < 60 ){
                iterator.remove();
            }
        }
        System.out.println("--------------删除不及格的同学后----------");
        for (Student student : collection) {
            System.out.println(student);
        }

    }
}
