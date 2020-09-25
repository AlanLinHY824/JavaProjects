package homework01;

/**
 * @AlanLin 2020/6/15
 */
public class Test {
    public static void main(String[] args) {
        Book book=new Book();
        book.print();
        System.out.println("==========================");
        Book book1=new Book("《战争与和平》", "列夫·托尔斯泰");
        Book book2=new Book("wx-001", "《战争与和平》", 30.5);
        Book book3=new Book("WX-002", "<龙族（三）>", 26.8, "江南");
        book1.print();
        System.out.println("==========================");
        book2.print();
        System.out.println("==========================");
        book3.print();
    }
}
