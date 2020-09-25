package homework07;

import java.util.TreeSet;

/**
 * 7 定义TreeSet集合存储Student对象,不在构造方法指定Comparator比较器, 让Student类实现Comparable接口,根据姓名升序排序,
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet=new TreeSet<>();
         studentTreeSet.add(new Student("lisi", 95));
         studentTreeSet.add(new Student("wangwu", 65));
         studentTreeSet.add(new Student("zhaoliu", 85));
         studentTreeSet.add(new Student("chenqi", 55));
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }

    }
}
