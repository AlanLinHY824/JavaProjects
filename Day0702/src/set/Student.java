package src.set;

import java.util.Objects;

/**
 *定义Student类,有学号,年级,成绩三个属性
 */
public class Student {
    int stuid;
    int  grade;
    int score;

    public Student(int stuid, int grade, int score) {
        this.stuid = stuid;
        this.grade = grade;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return stuid == student.stuid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuid);
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }
}
