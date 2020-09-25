package homework02;

/**
 * @AlanLin 2020/6/18
 */
public class BasePlusSalesEmployee extends SalesEmployee {
    double baseSalary;

    public BasePlusSalesEmployee() {
    }

    public BasePlusSalesEmployee(String name, int month, double sales, double commission, double baseSalary) {
        super(name, month, sales, commission);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        if (this.month==month){
            return baseSalary+sales*commission+100;
        }
        else {
            return baseSalary+sales*commission;
        }
    }
}
