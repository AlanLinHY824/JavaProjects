package homework03;

/**
 * @AlanLin 2020/6/19
 */
public class Bus extends Vehicle {
    private int seating;

    public Bus() {
    }

    public Bus(String brand, String id, int seating) {
        super(brand, id);
        if (seating>0){
        this.seating = seating;
        }
    }

    public int getSeating() {
        return seating;
    }

    public Bus setSeating(int seating) {
        if (seating>0){
            this.seating = seating;
        }
        return this;
    }

    @Override
    public double getSumRent(int days) {
        if (seating<=16&&seating>0){
            return 400*days;
        }
        else if (seating>16){
            return 600*days;
        }
        else {
            return 0;
        }
    }
}
