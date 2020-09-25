package String;

/**
 * @AlanLin 2020/6/28
 */
public class Test05 {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        /*
            关系运算符==判断两个变量的值是否相等
            s1==s2返回true。意味着s1变量和s2变量的值是相等的，
            对于引用类型变量来说，如果==相等表示引用了同一个对象
            双引号引起来的字符串字面值存储在字符串常量池中，即执行s1="hello"，系统会在字符串常量池中
            创建"hello"对象，把对象的引用赋值给s1，再执行s2="hello"时，系统直接把字符串常量池中的
            "hello"对象的引用赋值给s2
            早期JDK版本中字符串常量池存储在方法区中，从JDK7开始，有人说字符串常量池在堆内存中
            对于开发人员来说，只需要知道有一个字符串常量池即可，不需要关心在哪个区
         */

        String s3="hehe";

        String s4="he"+"he";
        System.out.println(s3==s4);
        /*
            java编译器会对字符串常量的连接进行优化，在.java编译为.class时，系统会把s4="he"+"he"优化为
            s4="hehe"
         */

        //以下两行共创建了多少个String对象,2个，一个是"abc"常量，一个是堆内存中new出来的
        String s5="abc";
        String s6=new String("abc");

        String s7="ab"+"cd";
        String s8=new String("ab")+new String("cd");
        String s9="abcd";
        System.out.println(s7==s9);//true
        System.out.println(s8==s9);//false
    }
}
