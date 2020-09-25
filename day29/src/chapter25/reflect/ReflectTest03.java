package chapter25.reflect;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 验证反射机制的灵活性
 * java代码写一遍，在不改变原来代码的情况下，可以实例化不同的对象，符合OCP开闭原则，对扩展开放，对修改关闭
 * 相对于new对象的方式比较灵活
 * 后期学习和使用的都是高级框架
 * 高级框架的底层实现原理都采用了反射机制，反射机制有利于理解剖析框架的底层源代码
 * @AlanLin 2020/7/14
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream=new FileInputStream("D:\\学习资料\\Java学习\\IdeaProjects\\src\\HelloWorld\\src\\chapter25\\classinfo.properties");
        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("chapter25/classinfo.properties");
        System.out.println(resourceAsStream);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("classname"));
        String className=properties.getProperty("classname");
//        ResourceBundle bundle=ResourceBundle.getBundle("chapter25/classinfo");
//        String className=bundle.getString("classname");
        Object c=Class.forName(className).newInstance();
        System.out.println(c);

    }
}
