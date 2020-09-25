package String;

/**
 * @AlanLin 2020/6/28
 */
public class Test06 {
    public static void main(String[] args) {
        String s1="hello";
        s1=s1+"world";
        /*
            通过Debug调试，发现使用+进行字符串连接时，底层使用了StringBuilder对象，执行
                new StringhBuilder().append(s1).append("world").toString()
         */
        //面试题   //2个字符串对象
        String s2="abc";
        String s3=s2+"abc"+s2;//连接的过程中没有创建新的字符串对象，使用StringBuilder连接后，创建新的对象返回
        String s11="abcabcabc";
        System.out.println(s11==s3);//false
        //面试题结束

        String s4="123abc123";
        System.out.println(s3==s4);
        String s5="123"+"abc"+"123";
        System.out.println(s2==s4);
        System.out.println(s5==s4);
//
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <10 ; i++) {
            sb.append(i);
        }
        System.out.println(sb.toString());

//
//        //对StringBuilder对象进行插入，删除修改等操作
//        sb.delete(3,8);
//        System.out.println(sb);
//        sb.insert(3,"hehe");
//        System.out.println(sb);
//        sb.replace(3, 7, "world");
//        System.out.println(sb);

    }
}
