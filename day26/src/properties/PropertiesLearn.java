package properties;

import java.io.*;
import java.util.Map;
import java.util.Properties;

/**
 * @AlanLin 2020/7/7
 */
public class PropertiesLearn {
    static Properties properties=new Properties();

    static {
        try {
            properties.load(new FileInputStream(new File("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\JavaProjects\\day26\\src\\properties\\test.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void show(){
        for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
            System.out.println(objectObjectEntry);
        }
    }

    public static void main(String[] args) throws IOException {
        show();
        System.out.println(properties.getProperty("username"));
        properties.setProperty("name", "123");//所有针对内存中properties对象的操作并没有影响到硬盘中的文件
        //执行以下语句，将map中的所有entry，写入硬盘下的文件当中
        properties.store(new FileOutputStream(new File("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\JavaProjects\\day26\\src\\properties\\test.properties")), "test");//路径必须是绝对路径
        properties.remove("name");
        show();//遍历时发现已经删除了key为name的entry，内存中的properties对象执行了删除操作，但是由于没有使用输出流对文件进行修改，所以文件中的内容并没有改动
        //重新加载文件
        try {
            properties.load(new FileInputStream(new File("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\JavaProjects\\day26\\src\\properties\\test.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        show();//重新将文件加载进properties对象，发现文件中对应的entry并未被删除
    }
}
