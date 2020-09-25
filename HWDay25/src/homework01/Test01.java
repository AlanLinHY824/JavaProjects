package homework01;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**
 * 1 定义Student类,有学号,年级,成绩三个属性
 *   创建Set集合, 存储30个Student对象, 每个Student对象的学号,年级,成绩随机生成.
 * 要求集合中学生的学号不允许重复
 * 找出成绩最高的学生, 找出成绩最低的学生
 * @AlanLin 2020/7/1
 */
public class Test01 {
    public static void main(String[] args) {
        TreeSet<Student> students=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.grade==o2.grade){
                    return 0;
                }
                return o1.score-o2.score;
            }
        });
        Random random=new Random();

        while (students.size()<30){
            Student student=new Student(String.valueOf(random.nextInt(1000)),random.nextInt(10),random.nextInt(101));
            students.add(student);
        }
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("成绩最高的学生为："+students.first());
        System.out.println("成绩最低的学生为："+students.last());







    }
}
