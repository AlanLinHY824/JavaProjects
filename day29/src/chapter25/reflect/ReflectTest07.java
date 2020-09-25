package chapter25.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 必须掌握
 * 如何通过反射机制访问一个对象的属性
 *  赋值set
 *  获取值get
 * @AlanLin 2020/7/15
 */
@Deprecated
public class ReflectTest07 {
    public static void main(String[] args) throws Exception {
        Class studentClass=Class.forName("chapter25.bean.Student");
        Object obj= studentClass.newInstance();
        //根据属性名称获取filed
        Field field=studentClass.getDeclaredField("no");
        //三个要素：对象、属性、要赋的值
        field.set(obj, 2222);
        //获取属性值
        //两个要素：对象、属性
        System.out.println(field.get(obj));
        //不能访问私有属性
        Field field1=studentClass.getDeclaredField("name");
        field1.setAccessible(true);//此方法可以打破封装，使得私有属性可以访问，这是反射机制的缺点，打破封装，可能会给不法分子留下机会
        field1.set(obj, "张三");
        System.out.println(field1.get(obj));
    }
}
