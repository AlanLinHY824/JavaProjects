package homework03;

/**
 * @AlanLin 2020/6/19
 */
public class Car extends Vehicle {
    String kind;

    public Car() {
    }

    public Car(String brand, String id, String kind) {
        super(brand, id);
        this.kind = kind;
    }

    @Override
    public double getSumRent(int days) {
        if (kind!=null){
            switch (kind){
                case "两厢":
                    return 300*days;
                case "三厢":
                    return 350*days;
                case "越野":
                    return 500*days;
                default:
                    System.out.println("车型输入错误");
                    return 0;
            }
        }
        System.out.println("小轿车未初始化车型");
        return 0;
    }
}
