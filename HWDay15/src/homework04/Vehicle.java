package homework04;

/**
 * @AlanLin 2020/6/17
 */
public class Vehicle {

    protected String brand;
    String id;

    public void print(){
        System.out.println(this.brand);
    }

    public String getBrand() {
        return brand;
    }

    public Vehicle setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getId() {
        return id;
    }

    public Vehicle setId(String id) {
        this.id = id;
        return this;
    }

    public double getSumRent(int days){
        return 0;
    }

    public Vehicle(String brand, String id) {
        this.brand = brand;
        this.id = id;
    }

    public Vehicle() {
    }
}
