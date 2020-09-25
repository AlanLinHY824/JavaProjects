package homework04;

/**
 * @AlanLin 2020/6/15
 */
public class Test {
    public static void main(String[] args) {
        Book book=new Book();
        book.print();
        System.out.println("==========================");
        Book book1=new Book("JF-001" , "《标准日本语》", 28.8, 50, "张敏",
                new Publisher("ISBN 978-7-107-27830-3", "人民教育出版社", "北京市海淀区中关村南大街17号院1号楼"));
        book1.print();
    }
}
