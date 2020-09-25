package homework02;

/**
 * @AlanLin 2020/6/19
 */
public class Car {
    private String brand;
    private String color;
    private double price;

    public Car() {
    }

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "品牌：" + brand  +
                ", 颜色：" + color  +
                ", 价格：" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                brand.equals(car.brand) &&
                color.equals(car.color);
    }
}
