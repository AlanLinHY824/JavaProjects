package com.bjpowernode.demo2;

/**
 * @AlanLin 2020/6/13
 */
public class Computer {
    private String brand;
    private String color;
    private int price;
    private double size;

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

}
