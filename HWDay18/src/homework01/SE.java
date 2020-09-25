package homework01;

/**
 * @AlanLin 2020/6/20
 */
public class SE implements IBusiness,ICode {
    String name;
    char gender;

    @Override
    public void speak() {
        System.out.println(name+"擅长业务");
    }

    @Override
    public void code() {
        System.out.println(name+"擅长写代码");
    }

    public SE(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public SE() {
    }
}
