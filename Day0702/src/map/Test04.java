package map;

import java.util.Properties;

/**
 * Properties
 */
public class Test04 {
    public static void main(String[] args) {
        //1) 创建Properties
        Properties properties = new Properties();

        //2) 设置属性
        properties.setProperty("username", "lisi");
        properties.setProperty("password", "123");

        //3) 读取属性
        System.out.println( properties.getProperty("username"));
        System.out.println( properties.get("password"));

        //4)获得系统属性
        properties = System.getProperties();
//        System.out.println( properties );
        System.out.println( properties.getProperty("user.dir"));    //用户目录
    }
}
