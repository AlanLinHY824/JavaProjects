package homework06;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 定义TreeSet集合存储Student对象,通过构造方法指定Comparator比较器,根据学生的成绩降序排序, 添加若干元素
 * treeSet.add( new Student(“lisi”, 85) );
 * treeSet.add( new Student(“wangwu”, 55) );
 * treeSet.add( new Student(“zhaoliu”, 85) );
 * treeSet.add( new Student(“chenqi”, 55) );
 * 遍历输出
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.grade-o1.grade;
            }
        });
         studentTreeSet.add(new Student("lisi", 85));
         studentTreeSet.add(new Student("wangwu", 55));
         studentTreeSet.add(new Student("zhaoliu", 85));
         studentTreeSet.add(new Student("chenqi", 55));
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }

    }
}
