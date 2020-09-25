package homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @AlanLin 2020/6/29
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<Student> c1=new ArrayList<>();

        //添加
        Student s1=new Student();
        c1.add(new Student("001","张三"));
        c1.add(s1);
        c1.add(new Student("002","李四"));
        c1.add(new Student("003","王五"));
        c1.add(new Student("004","赵六"));
        c1.add(new Student());

        //遍历
        for (Student student : c1) {
            System.out.println(student);
        }

        //判断
        System.out.println(c1.size());
        System.out.println(c1.contains(new Student("003","王五")));//contains方法实际上调用的是对象equals，如果对象没有重写equals方法的话就直接比较内存地址
        //contains只能判断集合是否包含某对象，不能直接contains(学生姓名)
        //如果需求是根据属性值判断，需要遍历集合中的对象进行判断
        boolean exist=false;

        System.out.println(c1.contains(s1));

        //删除
        c1.remove(s1);//也是调用对象的equals方法进行匹配然后删除
        for (Iterator<Student> iterator = c1.iterator(); iterator.hasNext(); ) {
            Student student =  iterator.next();
            if (student.name==null){
                iterator.remove();
            }
        }
    }
}
class Student{
    String id;
    String name;

    public Student() {
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
