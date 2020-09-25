package collection;

import java.util.Objects;

/**
 *
 */
public class Student {
    String stuid;
    String name;
    int score;

    public Student(String stuid, String name, int score) {
        this.stuid = stuid;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(stuid, student.stuid) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid='" + stuid + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
