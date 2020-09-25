package homework02;

/**
 * @AlanLin 2020/6/20
 */
public abstract class Animals {
    String nickname;
    int age;

    public abstract void voice();

    @Override
    public String toString() {
        return "Animals{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public Animals() {
    }

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
}
