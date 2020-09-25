package homework03;

/**
 * @AlanLin 2020/6/19
 */
public abstract class Vehicle {
    String brand;
    String id;

    public abstract double getSumRent(int days);

    public Vehicle() {
    }

    public Vehicle(String brand, String id) {
        this.brand = brand;
        this.id = id;
    }
}
