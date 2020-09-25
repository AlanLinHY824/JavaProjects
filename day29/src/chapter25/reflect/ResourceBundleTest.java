package chapter25.reflect;

import java.util.ResourceBundle;

/**
 * 资源绑定器
 * 只能用于读取配置文件，且属性配置文件必须方法哦类路径下
 * @AlanLin 2020/7/15
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        //只能绑定properties文件，且这个路径必须在类路径下(以src作为起点)
        //路径不能加扩展名
        ResourceBundle bundle=ResourceBundle.getBundle("chapter25/bean/db");
        String className=bundle.getString("classname");
        System.out.println(className);


    }
}
