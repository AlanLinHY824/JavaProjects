package set;

import java.util.TreeSet;

/**
 *
 */
public class Test05 {
    public static void main(String[] args) {
        //创建treeSet存储Student, 如果没有在TreeSet构造方法中指定Comparator,要求元素的类实现Comparable接口
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("lisi", 85));
        treeSet.add(new Student("wangwu", 55));
        treeSet.add(new Student("zhaoliu", 85));
        treeSet.add(new Student("chenqi", 55));
        treeSet.add(new Student("zhubau", 75));
        treeSet.add(new Student("feifei", 95));
        treeSet.add(new Student("zhangsan", 65));

        for (Student student : treeSet) {
            System.out.println( student );
        }
    }

    //Java把当前对象与另外一个对象比较大小的功能抽象到Comparable接口中,想让Student类对象能够比较大小,需要让Student类实现Comparable接口, Student类在实现Comparable接口时通过泛型指定比较元素的类型也是Student类型的对象
    static class Student implements Comparable<Student>{
        String name;
        int score;

        //重写Comparable接口的抽象方法,定义比较规则
        @Override
        public int compareTo(Student o) {
            return this.name.compareTo(o.name);     //当前对象的姓名大返回正数
        }

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
