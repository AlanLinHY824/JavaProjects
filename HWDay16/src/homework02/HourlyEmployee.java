package homework02;

/**
 * @AlanLin 2020/6/18
 */
public class HourlyEmployee extends Employee{
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
        double salary;
        if (hours>160){
            salary=160*hourlySalary+(hours-160)*1.5*hourlySalary;
        }
        else {
            salary=hours*hourlySalary;
        }

        if (this.month==month){
            return salary+100;
        }
        else {
            return salary;
        }

    }
}
