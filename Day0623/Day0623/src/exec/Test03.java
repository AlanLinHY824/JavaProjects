package Day0623.src.exec;

/**
 * 定义存储100个char类型字符的数组, 给数组的元素随机初始化小写字母, 统计小写字母a出现的次数
 */
public class Test03 {
    public static void main(String[] args) {
        //定义存储100个char类型字符的数组
        char [] data = new char[100];

        // 给数组的元素随机初始化小写字母
        for (int i = 0; i < data.length; i++) {
            int n = (int)(Math.random() * 26 );     //生成[0,26)范围内的整数
            char cc= (char)('a' + n);   //根据n随机整数生成小字字母
            data[i] = cc;
        }

        //打印数组元素
        for (int i = 0; i < data.length; i++) {
            System.out.print( data[i] + "  ");
        }
        System.out.println();

        //统计小写字母a出现的次数
        //遍历data数组的每个字符,如果该字符是a则计数器加1
        int count = 0 ; //保存a的次数
        for(char cc : data ){
            if (cc == 'a'){
                count++;
            }
        }
        System.out.println("a出现的次数为: " + count);
    }
}
