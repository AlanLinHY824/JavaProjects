package String;

/**
 * @AlanLin 2020/6/28
 */
public class Test01 {
    public static void main(String[] args) {
        //1)直接赋值字符串字面量
        String s1="hello";//"hello"也是一个字符串对象，系统把"hello"对象的引用赋值给s1

        //2）根据字节数组创建字符串对象
        byte[] bytes={65,66,67,68,69,70};
        //使用当前默认编码把字节数组创建为字符串
        String s2=new String(bytes);
        System.out.println(s2);
        s2=new String(bytes,0,5);
        System.out.println(s2);

        //3）根据字符数组创建String对象
        char[] chars={'A','b','5','*','汉','字'};
        String s3=new String(chars);
        System.out.println(s3);
        s3=new String(chars, 0, 3);
        System.out.println(s3);
        chars=new char[]{' '};
        s3=new String(chars);
        System.out.println(s3.equals(" "));


        //4）默认无参构造
        String s4=new String();
        System.out.println(s4==null);//在堆中创建一个String对象，把对象的引用赋值给s4，s4字符串相当于空串""，长度为0的字符串
        System.out.println(s4.equals(""));



    }
}
