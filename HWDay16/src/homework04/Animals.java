package homework04;

/**
 * @AlanLin 2020/6/18
 */
public class Animals {
    private String nickname;
    private int age;

    public void voice(){
        System.out.println("动物正在叫");
    }

    public void show(){
        System.out.println("昵称："+nickname);
        System.out.println("年龄："+age);
    }

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public Animals() {
    }

    public String getNickname() {
        return nickname;
    }

    public Animals setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Animals setAge(int age) {
        this.age = age;
        return this;
    }
}
