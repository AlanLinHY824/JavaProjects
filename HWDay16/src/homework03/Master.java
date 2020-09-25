package homework03;

/**
 * @AlanLin 2020/6/18
 */
public class Master {
    String name;

    public void feed(Pet pet){
        pet.eat();
    }

    public Master(String name) {
        this.name = name;
    }

    public Master() {
    }
}
