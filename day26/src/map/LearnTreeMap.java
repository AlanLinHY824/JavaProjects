package map;

import java.util.*;

/**
 * @AlanLin 2020/7/7
 */
public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String,Student> map =new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        map.put("123", null);
        map.put("89", null);
        map.put("34131", null);
        System.out.println(map);


    }
}

//存储的元素实现Comparable接口
class Student implements Comparable<Student>{
    String code;
    @Override
    public int compareTo(Student o) {
        return code.compareTo(o.code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(code, student.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

}
