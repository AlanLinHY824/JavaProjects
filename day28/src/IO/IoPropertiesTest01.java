package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * IO和Properties联合应用
 * 将经常改变的数据，使用程序动态读取
 * 将来只需要修改这个文件的内容，java代码不需要改动
 * 不需要重新编译，服务器也不需要重启，就可以拿到动态的信息
 * 类似于以上机制的文件被称为配置文件
 * 当配置文件的内容格式为键值对时，将这种配置文件称为属性配置文件
 * java规范中要求属性配置文件建议以properties作为后缀名，但这不是必须的
 * @AlanLin 2020/7/12
 */
public class IoPropertiesTest01 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("day28\\userinfo");

        Properties properties=new Properties();

        properties.load(fis);

        System.out.println(properties);
        properties.getProperty("username");


    }
}
