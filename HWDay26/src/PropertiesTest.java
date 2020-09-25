import java.io.*;
import java.util.Properties;

/**
 * @AlanLin 2020/7/7
 */
public class PropertiesTest {
    static Properties properties=new Properties();
    String fileName;

    public PropertiesTest(String fileName) {
        this.fileName = fileName;
    }

    //类加载时创建对象，并初始化读写的次数
    public static void main(String[] args) throws IOException {
        //通过构造方法传入需要访问的属性文件
        PropertiesTest propertiesTest=new PropertiesTest("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\JavaProjects\\HWDay26\\src\\test.properties");
        propertiesTest.setProperty("username", "zhangsan");
        propertiesTest.setProperty("password", "bjpowernode");
        propertiesTest.readProperty("username");
        propertiesTest.readProperty( "password");
        propertiesTest.setProperty("lisi", "ss");
    }

    public void setProperty(String key,String value) throws IOException {
        //加载文件，保证数据是最新的，以免其他操作修改properties文件后本处不是最新的Properties集合
        properties.load(new FileInputStream(fileName));
        properties.put(key, value);
        //判断是否为第一次写入
        if (properties.getProperty("editCount")==null){
            properties.put("editCount","0");
        }
        properties.setProperty("editCount", String.valueOf(Integer.parseInt(properties.getProperty("editCount"))+1));
        properties.store(new FileOutputStream(fileName), "最新一次操作为写入");
    }

    public void readProperties() throws IOException {
        //加载文件，保证数据是最新的，以免其他操作修改properties文件后本处不是最新的Properties集合
        properties.load(new FileInputStream(fileName));
        System.out.println(properties);
        //判断是否为第一次读取
        if (properties.getProperty("readCount")==null){
            properties.put("readCount","0");
        }
        properties.setProperty("readCount", String.valueOf(Integer.parseInt(properties.getProperty("readCount"))+1));
        properties.store(new FileOutputStream(new File(fileName)), "最新一次操作为读取");
    }

    public void readProperty(String key) throws IOException {
        //加载文件，保证数据是最新的，以免其他操作修改properties文件后本处不是最新的Properties集合
        properties.load(new FileInputStream(fileName));
        System.out.println(properties.getProperty(key));
        //判断是否为第一次读取
        if (properties.getProperty("readCount")==null){
            properties.put("readCount","0");
        }
        properties.setProperty("readCount", String.valueOf(Integer.parseInt(properties.getProperty("readCount"))+1));
        properties.store(new FileOutputStream(new File(fileName)), "最新一次操作为读取");

    }
}
