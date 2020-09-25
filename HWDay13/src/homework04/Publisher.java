package homework04;

/**
 * @AlanLin 2020/6/15
 */
public class Publisher {
    String no;
    String name;
    String addr;

    public Publisher() {
    }

    public Publisher(String no, String name, String addr) {
        this.no = no;
        this.name = name;
        this.addr = addr;
    }

    public void print(){
        System.out.println("出版社编号："+no+"\n"+"出版社名称："+name+"\n"+"出版社地址："+addr);
    }
}
