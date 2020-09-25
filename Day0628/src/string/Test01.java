package src.string;

/**
 * 创建String对象
 */
public class Test01 {
    public static void main(String[] args) {
        //1) 直接赋值字符串字面量
        String s1 = "hello";        //"hello"双引号引起来的字符串字面量,也是一个String字符串对象, 系统会把"hello"对象的引用赋值给s1,  就像 int x = 10;中的10是整数字面量,10也是int类型的数据

        //2) 根据字节数组创建String字符串对象
        byte [] bytes = {65,66,67,68,69, 70};
        //使用当前默认的编码把bytys字节数组中的字节转换为字符串
        String s2 = new String(bytes);
        System.out.println( s2 );       //ABCDEF
        s2 = new String(bytes, 0 , 5);  //把bytes数组从0开始的5个字节转换为字符串
        System.out.println( s2 );       //ABCDE

        //3)根据字符数组创建String对象
        char [] chars = {'A','b','5','*','汉','字'};
        String s3 = new String(chars);  //把chars数组中所有的字符转换为字符串
        System.out.println( s3 );       //Ab5*汉字
        s3 = new String(chars, 0 , 3);  //把chars数组从0开始的3个字符转换为字符串
        System.out.println( s3 );       //Ab5

        //String()
        String s4 = new String();       //new运算符在堆中创建一个String对象,把该对象的引用赋值给s4, s4字符串相当于空串"", 是一个长度为0的字符串
        System.out.println( s4 == null );   //false

        String s5 = new String(s1);
        System.out.println( s5 );       //hello
        System.out.println( s1 == s5 );     //false

    }
}
