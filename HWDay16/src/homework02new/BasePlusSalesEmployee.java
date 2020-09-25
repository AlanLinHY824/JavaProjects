package homework02new;

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
            return baseSalary+super.getSalary(month);
    }
}
