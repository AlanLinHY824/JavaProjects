package homework2;

/**
 * @AlanLin 2020/6/13
 */
public class Cat {
    public Cat(String nickname) {
        this.nickname=nickname;
    }


    String nickname="猫咪";
    {this.nickname="小猫";}
    int age;
    String gender;
    double weight;
    String variety;
    public void print(){
        System.out.println("猫咪的信息如下："+"\n"+"昵称："+nickname+"\n"+"年龄："+
                age+"\n"+"性别："+gender+"\n"+"体重："+weight+"Kg\n"+"品种："+variety);
    }
}
