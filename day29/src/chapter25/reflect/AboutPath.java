package chapter25.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *这种方式获取绝对路径是通用的，可以跨系统使用，前提是文件需要在src路径下才可以
 * 使用这种方式得到的绝对路径是从项目所在系统的绝对路径，项目随便移植，都能够获取，使得程序更加灵活
 * @AlanLin 2020/7/14
 */
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
        //这种方式的路径，缺点是植性差，在IDEA中默认的当前路径是project的根，移植后就不起作用了
        //FileInputStream fileInputStream=new FileInputStream("D:\\学习资料\\Java学习\\IdeaProjects\\src\\HelloWorld\\src\\chapter25\\classinfo.properties");
        FileInputStream fileInputStream=new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\JavaProjects\\day29\\src\\chapter25\\reflect\\AboutPath.java");
        //以下是一种通用的路径，使用的前提是，文件必须在类路径下，凡是在src下的都是类路径下
        //src是类的根路径
        //currentThread()是当前线程对象
        //getContextClassLoader()是线程对象的方法，可以获取到当前线程的类加载器对象
        //getResource()是类加载器的方法，当前线程的类加载器默认从类的根目录下加载资源
        String path=Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        String path2=Thread.currentThread().getContextClassLoader().getResource("chapter25/bean/db.properties").getPath();
        String path3=Thread.currentThread().getContextClassLoader().getResource("chapter25/reflect/Reflecttest01.class").getPath();
        String path4=Thread.currentThread().getContextClassLoader().getResource("chapter25/reflect/Reflecttest01.java").getPath();//无法获取，因为java文件不在类路径下，看似获取的是src下的文件，但实际上获取的是out文件夹中该module文件夹的字节码文件，只不过是因为在src下的文件才会在out文件夹下生成，所以在开发时，以src文件夹为类的根路径
        System.out.println(path3);
        //采用以上方法可以获得一个文件的绝对路径

    }
}
