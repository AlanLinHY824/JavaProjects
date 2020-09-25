package homework04;

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

    public void print(){
        System.out.println(super.brand);
    }


    @Override
    public double getSumRent(int days) {
        switch (kind){
            case "两厢":
                return 300*days;
            case "三厢":
                return 350*days;
            case "越野":
                return 500*days;
            default:
                System.out.println("小轿车车型输入错误");
                return 0;
        }
    }

}
