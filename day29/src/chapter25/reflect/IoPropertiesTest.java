package chapter25.reflect;

import java.io.*;
import java.net.URLDecoder;
import java.util.Properties;

/**
 * @AlanLin 2020/7/14
 */
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        String path =Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
//        File file=new File("src\\classinfo2.properties");
//        System.out.println(file.getAbsoluteFile());
        path= URLDecoder.decode(path, "utf-8");//对中文解码
        System.out.println(path);
        //FileReader reader=new FileReader(path);

        FileInputStream reader=new FileInputStream(path);

        //通过getResourceAsStream()方法直接返回流
        //InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo2.properties");//返回值类型为BufferedInputStream
        Properties properties=new Properties();
        properties.load(reader);
        reader.close();
        String className=properties.getProperty("classname");
        System.out.println(className);


    }
}
