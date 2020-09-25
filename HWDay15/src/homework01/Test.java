package homework01;

/**
 * @AlanLin 2020/6/17
 */
public class Test {
    public static void main(String[] args) {
        Books book=new Books();
        book.setBookNum("WX-001").setBookName("龙族").setPrice(25.6).setBookQty(560);
        System.out.println("图书编号："+book.getBookNum());
        System.out.println("图书名称："+book.getBookName());
        System.out.println("图书价格："+book.getPrice());
        System.out.println("图书数量："+book.getBookQty());
    }
}
