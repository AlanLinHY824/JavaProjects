package homework01;

import java.util.Objects;

/**
 * @AlanLin 2020/7/1
 */
public class Student {
    String id;
    int grade;
    int score;

    public Student(String id, int grade, int score) {
        this.id = id;
        this.grade = grade;
        this.score = score;
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade &&
                score == student.score &&
                Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, grade, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
}
