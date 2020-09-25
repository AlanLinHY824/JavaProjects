package homework01;

/**
 * @AlanLin 2020/6/17
 */
public class Car extends Vehicle{
    String kind;

    public Car(String brand, String id, String kind) {
        super(brand, id);
        this.kind = kind;
    }

    public Car() {
    }

    @Override
    public double getSumRent(int days) {
        if ("两厢".equals(kind)){
            return 300*days;
        }
        else if ("三厢".equals(kind)){
            return 350*days;
        }
        else if ("越野".equals(kind))
            return 500*days;
        else {
            System.out.println("小轿车车型输入错误");
            return 0;
        }
    }

}
