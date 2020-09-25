package demo7;

/**
 * @AlanLin 2020/6/17
 */
public class Teacher extends Person{
    double salary;

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("工资："+salary);
    }

    public void teach(){
        System.out.println("教师"+name+"正在教学");
    }

    public Teacher(String name, char gender, int age, double salary) {
        super(name, gender, age);
        this.salary = salary;
    }

    public Teacher() {
    }
}
