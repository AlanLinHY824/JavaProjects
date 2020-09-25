package src.set;


import java.util.*;

/**
 *
 *   创建Set集合, 存储30个Student对象, 每个Student对象的学号,年级,成绩随机生成.
 * 要求集合中学生的学号不允许重复
 * 找出成绩最高的学生, 找出成绩最低的学生
 */
public class Test09 {
    public static void main(String[] args) {
        // 创建HashSet集合存储Student对象,
        // 要求学号不重复, 在HashSet集合中存储自定义类型对象,需要重写equals()/hashCode()方法,因为HashSet存储位置与 hashCode() 有关,  当前要求学号不重复, 只根据学号生成equals()/hashCode()即可
        Set<Student> set = new HashSet<>();

        //创建TreeSet存储Student对象, 可以根据学号排序
      /*  Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.stuid - o2.stuid;
            }
        });*/

        Random random = new Random();

        while ( set.size() < 30 ){
            int stuid = random.nextInt(10000) + 10000;  //生成[10000, 20000)范围的学号
            int grade = random.nextInt(6) + 1;      //生成[1,7)范围内的年级
            int score = random.nextInt(100);        //生成[0,100)范围内的成绩
            set.add( new Student(stuid, grade, score) );
        }
        for (Student student : set) {
            System.out.println(student);
        }

        //找出成绩最高的学生, 找出成绩最低的学生
        //可以根据成绩排序, 再创建TreeSet集合,根据成绩降序(升序)排序, 成绩相同再根据学号升序
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o2.score != o1.score ) {
                    return o2.score - o1.score;
                }
                return  o1.stuid - o2.stuid;        //成绩一样,学号升序
            }
        });
        treeSet.addAll(set);    //把hashset集合中所有的学生都添加到treeSet集合中
        System.out.println("---------------成绩降序--------------");
        for (Student student : treeSet) {
            System.out.println( student );
        }

        System.out.println("最高分学生的信息:");
        //最高分
        Student first = treeSet.first();
        //遍历treeSet集合中的元素
        for (Student student : treeSet) {
            if ( student.score == first.score ){
                System.out.println( student );
            }else {
                break;
            }
        }

        System.out.println("最低分学生信息:");
        //最低分
        Student last = treeSet.last();
        //从后向前遍历
        Iterator<Student> studentIterator = treeSet.descendingIterator();
        while ( studentIterator.hasNext() ){
            Student next = studentIterator.next();
            if (next.score == last.score ){
                System.out.println(next);
            }else {
                break;
            }
        }

    }
}
