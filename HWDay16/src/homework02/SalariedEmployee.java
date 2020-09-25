package homework02;

/**
 * @AlanLin 2020/6/18
 */
public class SalariedEmployee extends Employee{
    double monthltSalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int month, double monthltSalary) {
        super(name, month);
        this.monthltSalary = monthltSalary;
    }

    @Override
    public double getSalary(int month) {
        if (this.month==month){
            return monthltSalary+100;
        }
        else {
            return monthltSalary;
        }
    }
}
