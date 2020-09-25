package homework03;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 已知有16支足球队参数2023年中国举办的世界足球杯比赛, 编写程序, 把这16支球队随机分成4个小组
 * 足球队有: 中国, 越南,韩国,日本,新加坡, 缅甸,泰国, 阿联酋, 叙利亚, 巴西, 西班牙,英国,德国,意大利, 法国, 俄罗斯
 * @AlanLin 2020/6/30
 */
public class Test {
    public static void main(String[] args) {
        String[] strings=new String[]{"中国","越南","韩国","日本","新加坡","缅甸","泰国", "阿联酋", "叙利亚", "巴西","西班牙","英国","德国","意大利","法国", "俄罗斯"};
        HashSet<String> hashSet=new HashSet<>();
        for (String nation:strings) {
            hashSet.add(nation);
        }
        hashSet.toArray(strings);
        System.out.println(Arrays.toString(strings));
        String[] groupOne=Arrays.copyOfRange(strings, 0, 4);
        String[] groupTwo=Arrays.copyOfRange(strings, 4, 8);
        String[] groupThree=Arrays.copyOfRange(strings, 8, 12);
        String[] groupFour=Arrays.copyOfRange(strings, 12, 16);
        System.out.println(Arrays.toString(groupOne));
        System.out.println(Arrays.toString(groupTwo));
        System.out.println(Arrays.toString(groupThree));
        System.out.println(Arrays.toString(groupFour));


    }
}
