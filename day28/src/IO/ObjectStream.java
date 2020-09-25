package IO;

import java.io.*;
import java.util.Objects;

/**
 * 对象流的使用（序列化与反序列化）
 * @AlanLin 2020/7/10
 */
public class ObjectStream {
    public static void main(String[] args) {
        write();
        read();
    }
    //对象流写入（序列化）
    public static void write(){
        Student student=new Student("001","zhangsan","01");
        Student student2=new Student("002","zhangsan","01");
        Student student3=new Student("002","zhangsan","01");
        Student student4=new Student("002","zhangsan","01");
        try(OutputStream is=new FileOutputStream("d:\\student");
            ObjectOutputStream oos=new ObjectOutputStream(is)){
            oos.writeObject(student);
            oos.writeObject(student2);
            oos.writeObject(student3);
            oos.writeObject(student4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void read(){
        try(InputStream is=new FileInputStream("d:\\student");
            ObjectInputStream ois=new ObjectInputStream(is)){
            Student student=(Student) ois.readObject();
            Student student2=(Student) ois.readObject();
            Student student3=(Student) ois.readObject();
            Student student4=(Student) ois.readObject();
            System.out.println(student);
            System.out.println(student2);
            System.out.println(student3);
            System.out.println(student4);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Student implements Comparable<Student> , Serializable {
    //private static final long serialVersionUID = -2536491012470000836L;
    String code;
    String name;
    String grade;
    @Override
    public int compareTo(Student o) {
        return code.compareTo(o.code);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(code, student.code) &&
                Objects.equals(name, student.name) &&
                Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, grade);
    }

    public Student(String code, String name, String grade) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

