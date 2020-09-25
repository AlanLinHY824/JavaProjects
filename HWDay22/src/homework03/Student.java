package homework03;

import java.util.Objects;

/**
 * @AlanLin 2020/6/28
 */
public class Student {
        String id;
        String name;
        int grade;

        public Student(String id, String name, int grade) {
                this.id = id;
                this.name = name;
                this.grade = grade;
        }

        public Student() {
        }

        @Override
        public String toString() {
                return "Student{" +
                        "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", grade=" + grade +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return grade == student.grade &&
                        Objects.equals(id, student.id) &&
                        Objects.equals(name, student.name);
        }
}
