package src.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 定义Map存储<课程名称, 教师名称>
 */
public class Test01 {
    public static void main(String[] args) {
        //定义Map存储<课程名称, 教师名称>
        Map<String, String> map = new HashMap<>();

        //添加数据
        map.put("数学", "张老师");
        map.put("语文", "李老师");
        map.put("英文", "王老师");
        map.put("科学", "杜老师");
        map.put("体育", "张老师");

        //遍历
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println( entry );
        }

        //修改
        map.replace("体育", "刘老师");
        System.out.println( map );

        //删除
        map.remove("科学");
        System.out.println(map);

        //判断
        System.out.println( map.containsKey("计算机"));    //false
        System.out.println( map.containsValue("李老师"));  //true
    }
}
