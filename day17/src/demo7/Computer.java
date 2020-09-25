package demo7;

import java.util.Objects;

/**
 * @AlanLin 2020/6/19
 */
public class Computer {
    String brand;
    String color;
    int price;
    double size;

    public Computer(String brand, String color, int price, double size) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return price == computer.price &&
                Double.compare(computer.size, size) == 0 &&
                Objects.equals(brand, computer.brand) &&
                Objects.equals(color, computer.color);
    }


}
