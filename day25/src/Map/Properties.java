package Map;

import java.io.IOException;
import java.io.InputStream;
import java.util.ResourceBundle;

/**
 * Properties
 * @AlanLin 2020/7/3
 */
public class Properties {
    public static void main(String[] args) throws IOException {
        java.util.Properties properties=new java.util.Properties();

        //设置属性
        properties.setProperty("username", "lisi");
        properties.setProperty("password", "123");

        //读取属性
        System.out.println(properties.get("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties);

        //获取系统属性
        properties=System.getProperties();
        System.out.println(properties);
        System.out.println(properties.getProperty("user.dir")); //用户目录，即项目的根目录

        //在实际开发中，经常把属性保存到配置文件中，通过Properties读取配置文件中的属性
        //经常在src目录中单独创建一个resources资源包，在resources资源包中添加配置文件
        //选中resources包，右键，new-->resource Bundle在弹出的对话框中输入配置文件名
        //注意不需要输入扩展名，resource Bundle默认扩展名就是.properties

        m1();//通过Properties读取配置文件
        m2();//通过resource Bundle读取


    }

    private static void m2() {
        //创建对象
        ResourceBundle bundle=ResourceBundle.getBundle("resources/config");//不能加上扩展名
        //读取配置文件属性
        System.out.println(bundle.getString("username"));
    }

    private static void m1() throws IOException {
        java.util.Properties properties=new java.util.Properties();

        //调用load()方法加载配置文件
        //可以通过当前类字节码的类加载器获得流通道
        InputStream in= Properties.class.getClassLoader().getResourceAsStream("resources/config.properties");//需要加上扩展名
        properties.load(in);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("用户名"));

    }
}
