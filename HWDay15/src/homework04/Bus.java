package homework04;

/**
 * @AlanLin 2020/6/17
 */
public class Bus extends Vehicle {
    int seating;

    public Bus(String brand, String id, int seating) {
        super(brand, id);
        this.seating = seating;
    }

    public Bus() {
    }

    @Override
    public double getSumRent(int days) {
        int result;
        if (seating>16){
            result=600*days;
        }
        else {
            result=400*days;
        }
        return result;
    }
}
