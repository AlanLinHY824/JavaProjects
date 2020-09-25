package homework02new;

/**
 * @AlanLin 2020/6/18
 */
public class SalesEmployee extends Employee {
    double sales;
    double commission;

    public SalesEmployee() {
    }

    public SalesEmployee(String name, int month, double sales, double commission) {
        super(name, month);
        this.sales = sales;
        this.commission = commission;
    }

    @Override
    public double getSalary(int month) {
        return sales*commission+super.getSalary(month);

    }
}
