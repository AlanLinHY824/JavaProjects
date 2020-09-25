package set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合判断元素是否相同,是根据比较结果是否为0来判断的
 * <p>
 * 定义TreeSet集合存储Student对象,通过构造方法指定Comparator比较器,根据学生的成绩降序排序, 添加若干元素
 */
public class Test04 {
    public static void main(String[] args) {
        //定义TreeSet集合存储Student对象
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.score - o1.score;    //o2成绩大返回正数,对应降序排序
            }
        });

        treeSet.add(new Student("lisi", 85));
        treeSet.add(new Student("wangwu", 55));
        treeSet.add(new Student("zhaoliu", 85));
        treeSet.add(new Student("chenqi", 55));
        treeSet.add(new Student("zhubau", 75));
        treeSet.add(new Student("feifei", 95));
        treeSet.add(new Student("zhangsan", 65));
        //在当前treeSet集合中通过Comparator指定根据分数排序,  compare方法如果返回0就认为是相同的两个元素
        //在添加完lisi, wangwu后, 再添加zhaoliu同学,成绩85与lisi成绩相同就认为是相同的元素, 再添加chenqi时,他成绩55与wangwu相同,就认为是相同的元素

        //遍历
        for (Student student : treeSet) {
            System.out.println(student);
        }

        Student stu = new Student("heheheh", 65);
        System.out.println(treeSet.contains(stu));    //true,  当前treeSet只比较成绩, 如果treeset集合中有某个学生对象的成绩与heheheh的成绩65一样, 就认为是相同的元素
    }


    static class Student {
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}