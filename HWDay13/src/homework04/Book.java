package homework04;

/**
 * 编写图书类：
 * 属性：编号，名称，单价，数量, 作者, 出版社
 * 构造方法：无参构造方法、带参构造方法
 * 定义方法：显示图书的信息（编号，名称，单价，数量, 作者, 出版社名称，出版社地址)
 * @AlanLin 2020/6/15
 */
public class Book {
    String no;
    String name;
    double price;
    int qty;
    String author;
    Publisher publisher;

    public Book() {
    }

    public Book(String no, String name, double price, int qty, String author, Publisher publisher) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.author = author;
        this.publisher = publisher;
    }
    public void print(){
        System.out.println("图书编号："+no+"\n"+"图书名称："+name+"\n"+"图书价格："+price+"\n"+"图书数量："+qty+"\n"+"图书作者："+
                author+"\n"+"出版社编号："+(publisher==null?"null":publisher.no)+"\n"+"出版社名称："+
                (publisher==null?"null":publisher.name)+"\n"+"出版社地址："+(publisher==null?"null":publisher.addr));
    }

}
