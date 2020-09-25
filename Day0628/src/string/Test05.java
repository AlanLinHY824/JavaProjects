package src.string;

/**
 *
 */
public class Test05 {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1 + "world";
        /*
            通过Debug调试, 发现使用 + 进行字符串连接时,底层使用了StringBuilder对象,执行:
                new StringBuilder().append(s1).append("world").toString()
            在StringBuilder对象的toString()方法中,new出来一个新的String对象返回了, 所以说每次使用+进行字符串连接时都会创建新的String对象
         */

        //面试, 以下两行共创建了多少个String对象?  2个 "abc"一个,  连接后生成一个新的
        String s2 = "abc";
        String s3 = s2 + "abc" + s2;

        //频繁字符串连接使用StringBuilder
        StringBuilder sb = new StringBuilder();     //创建StringBuilder对象
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(sb);

        //对StringBuilder对象进行插入,删除修改等操作
        sb.delete(3, 8);
        System.out.println( sb );       //01289
        sb.insert(3, "hehe");
        System.out.println( sb );       //012hehe89
        sb.replace(2,8,"world");
        System.out.println(sb);     //012world89
    }
}
