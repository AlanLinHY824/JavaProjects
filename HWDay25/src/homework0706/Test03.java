package homework0706;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @AlanLin 2020/7/6
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String,Student> studentMap =new HashMap<>();

        Student student1=new Student("001", "zhangsan", 95);
        Student student2=new Student("002", "lisi", 90);
        Student student3=new Student("003", "wangwu", 90);
        Student student4=new Student("004", "zhaoliu", 95);

        studentMap.put("学生1", student1);
        studentMap.put("学生2", student2);
        studentMap.put("学生3", student3);
        studentMap.put("学生4", student4);
        System.out.println("方法1");
        for (String ss:studentMap.keySet()) {
            System.out.println(studentMap.get(ss));
        }
        System.out.println("方法2");
        for (Map.Entry<String,Student> entry:studentMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("方法3");
        for (Student student:studentMap.values()) {
            System.out.println(student);
        }

    }
}
class Student{
    String id;
    String name;
    int score;

    public Student() {
    }

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                Objects.equals(id, student.id) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
