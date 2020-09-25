package homework02;

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
        if (this.month==month){
            return sales*commission+100;
        }
        else {
            return sales*commission;
        }
    }
}
