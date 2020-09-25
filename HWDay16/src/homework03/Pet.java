package homework03;

/**
 * @AlanLin 2020/6/18
 */
public class Pet {
    String nickname;

    public void eat(){
        System.out.println("宠物正在吃食物");
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet() {
    }
}
