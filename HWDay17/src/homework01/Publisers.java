package homework01;

/**
 * @AlanLin 2020/6/19
 */
public class Publisers {
    String no;
    String name;
    String addr;

    public Publisers() {
    }

    public Publisers(String no, String name, String addr) {
        this.no = no;
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Publisers{" +
                "出版社编号：" + no +
                ", 出版社名称：" + name  +
                ", 出版社地址：" + addr  +
                '}';
    }
}
