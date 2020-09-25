package demo7;

/**
 * @AlanLin 2020/6/18
 */
public class Test3 {
    public static void main(String[] args) {
        Person p=new Student();
        if (p instanceof Student){
            Student s=(Student)p;
            System.out.println(s.stuId);
            s.study();
        }
    }
}
