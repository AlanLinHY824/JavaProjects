package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 已知有16支足球队参数2023年中国举办的世界足球杯比赛, 编写程序, 把这16支球队随机分成4个小组. 足球队有: 中国, 越南,韩国,日本,新加坡, 缅甸,泰国, 阿联酋, 叙利亚, 巴西, 西班牙,英国,德国,意大利, 法国, 俄罗斯
 */
public class Test02 {
    public static void main(String[] args) {
        //定义List集合存储16支球队
        List<String> allTeams = new ArrayList<>();
        allTeams.add("中国");
        allTeams.add("越南");
        allTeams.add("韩国");
        allTeams.add("日本");
        allTeams.add("新加坡");
        allTeams.add("缅甸");
        allTeams.add("泰国");
        allTeams.add("阿联酋");
        allTeams.add("叙利亚");
        allTeams.add("巴西");
        allTeams.add("西班牙");
        allTeams.add("英国");
        allTeams.add("德国");
        allTeams.add("意大利");
        allTeams.add("法国");
        allTeams.add("俄罗斯");

        //把球队分为四个小组,可以定义四个集合存储四个小组中的球队
        List<String> groupA = new ArrayList<>();
        List<String> groupB = new ArrayList<>();
        List<String> groupC = new ArrayList<>();
        List<String> groupD = new ArrayList<>();

        Random random = new Random();
        //向groupA小组中添加四支球队
        for (int i = 0; i < 4; i++) {
            int x = random.nextInt( allTeams.size() );  //[0, allTeams.size())范围内的随机数
            groupA.add(  allTeams.get(x) );     //把x索引值的元素添加到A组中
            allTeams.remove(x);     //allteams集合中索引值为x的元素分组到A组中,不再继续参与后面的分组了
        }
         //向groupB小组中添加四支球队
        for (int i = 0; i < 4; i++) {
            int x = random.nextInt( allTeams.size() );  //[0, allTeams.size())范围内的随机数
            groupB.add(  allTeams.get(x) );     //把x索引值的元素添加到A组中
            allTeams.remove(x);     //allteams集合中索引值为x的元素分组到A组中,不再继续参与后面的分组了
        }
         //向groupC小组中添加四支球队
        for (int i = 0; i < 4; i++) {
            int x = random.nextInt( allTeams.size() );  //[0, allTeams.size())范围内的随机数
            groupC.add(  allTeams.get(x) );     //把x索引值的元素添加到A组中
            allTeams.remove(x);     //allteams集合中索引值为x的元素分组到A组中,不再继续参与后面的分组了
        }
          //向groupD小组中添加四支球队
        for (int i = 0; i < 4; i++) {
            int x = random.nextInt( allTeams.size() );  //[0, allTeams.size())范围内的随机数
            groupD.add(  allTeams.get(x) );     //把x索引值的元素添加到A组中
            allTeams.remove(x);     //allteams集合中索引值为x的元素分组到A组中,不再继续参与后面的分组了
        }

        System.out.println(groupA);
        System.out.println(groupB);
        System.out.println(groupC);
        System.out.println(groupD);
    }
}
