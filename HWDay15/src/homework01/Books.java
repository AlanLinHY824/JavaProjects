package homework01;

/**
 * 1. 编写图书类，属性：图书编号、图书名称、图书价格、图书数量
 *    要求：使用封装完成，通过set方法连缀操作完成对属性赋值，通过get方法输出属性的值
 *   编写测试类，通过调用set方法完成对属性赋值，调用get方法输出属性的值
 * @AlanLin 2020/6/17
 */
public class Books {
    private String bookNum;
    private String bookName;
    private double price;
    private int bookQty;

    public String getBookNum() {
        return bookNum;
    }

    public Books setBookNum(String bookNum) {
        this.bookNum = bookNum;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Books setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Books setPrice(double price) {
        this.price = price;
        return this;
    }

    public int getBookQty() {
        return bookQty;
    }

    public Books setBookQty(int bookQty) {
        this.bookQty = bookQty;
        return this;
    }
}
