package exec;

/**
 * 定义存储100个char类型字符的数组, 给数组的元素随机初始化小写字母, 统计每个字母出现的次数
 */
public class Test03 {
    public static void main(String[] args) {

        char[] data = new char[100];
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)('a' + (int)(Math.random() * 26));
        }
        for (char cc : data) {
            System.out.print(cc + "  ");
        }
        System.out.println();

        //定义长度为26的存储整数的数组
        int [] counts = new int[26];
        //约定counts[0]存储a的次数, counts[1]存储b的次数, counts[2]存储c的次数, counts[3]存储d的次数, ...... counts[25]存储z的次数,
        //规律: counts[i]元素存储 (char)('a' + i )字符的次数
        //或者: 小写字母 cc 的次数存在  counts[ cc - 'a' ] 元素中
        for( char cc : data ){
            //遍历数组中的每个字符, 把counts[cc-'a']元素的值加1即可
            counts[cc - 'a']++;
        }

        //打印结果
       /* for (int i = 0; i < counts.length; i++) {
            System.out.println((char)('a' + i ) + "字符的次数: " + counts[i] );
        }*/
       for( char cc='a'; cc <= 'z' ; cc++ ){
           System.out.println( cc + "出现的次数: " + counts[cc-'a']);
       }
    }
}
