package map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 在实际开发中, 经常把属性保存到配置文件中, 通过Properties读取配置文件中的属性
 * 经常在src目录中单独创建一个resources资源包, 在resources资源包中添加配置文件
 *  选中resources包, 右键, new -->resource Bundle 在弹出的对话框中输入配置文件名, 注意不需要输入扩展名, ResourceBundle默认扩展名就是.properties
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
//        m1();   //通过Properties读取配置文件
        m2();   //通过ResourceBundle读取配置文件
    }

    private static void m2() {
        //1) 创建ResouceBundle, 不需要配置文件扩展名
        ResourceBundle bundle = ResourceBundle.getBundle("resources/config");
        //2)读取配置文件属性
        System.out.println( bundle.getString("username"));
        System.out.println( bundle.getString("password"));
        System.out.println( bundle.getString("属性名"));
    }

    private static void m1() throws IOException {
        //1) 创建Properties对象
        Properties properties = new Properties();

        //2) 调用Properties对象的load()方法加载配置文件
        //可以通过当前类字节码的类加载器获得流通道
//        InputStream in = Test05.class.getClassLoader().getResourceAsStream("resources/config.properties");
        //Thread.currentThread()当前线程, 通过当前线程的上下文类加载器获得流通道
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("resources/config.properties");
        //load(InputStream)有受检异常需要预处理(异常后面讲), 当前Alt + enter 在弹出的对话框中选择Add exception to method signature抛出处理, 如果配置文件路径不正确,就会抛出异常
        properties.load(in);

        //3) 调用Properties对象的getProperty()读取属性值
        System.out.println( properties.getProperty("username"));
        System.out.println( properties.getProperty("password"));
        System.out.println( properties.get("属性名"));
    }
}
