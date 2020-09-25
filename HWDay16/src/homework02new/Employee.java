package homework02new;

/**
 * @AlanLin 2020/6/18
 */
public class Employee {
    String name;
    int month;

    public double getSalary(int month){
        if (this.month==month) {
            return 100;}
        return 0;
    }

    public Employee(String name, int month) {
        this.name = name;
        this.month = month;
    }

    public Employee() {
    }
}
