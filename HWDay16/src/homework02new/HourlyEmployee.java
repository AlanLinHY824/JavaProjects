package homework02new;

/**
 * @AlanLin 2020/6/18
 */
public class HourlyEmployee extends Employee {
    double hourlySalary;
    double hours;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int month, double hourlySalary, double hours) {
        super(name, month);
        this.hourlySalary = hourlySalary;
        this.hours = hours;
    }

    @Override
    public double getSalary(int month) {
        if (hours>160){
            return 160*hourlySalary+(hours-160)*1.5*hourlySalary+super.getSalary(month);
        }
        else {
            return hours*hourlySalary+super.getSalary(month);
        }

    }
}
