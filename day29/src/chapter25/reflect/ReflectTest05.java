package chapter25.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射Student类中所有的类
 * @AlanLin 2020/7/15
 */
public class ReflectTest05 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c=Class.forName("chapter25.bean.Student");
        Field field=c.getDeclaredField("name");
        System.out.println(field);
        Field[] fields=c.getFields();//获取类中所有public的属性，getDeclaredField可以获得该类中声明的所有属性
        System.out.println(fields[0].getName());

        Field[] fields1=c.getDeclaredFields();
        System.out.println(fields1.length);
        for (Field field1 : fields1) {
            //返回属性的修饰符列表
            int i=field1.getModifiers();//返回的修饰符是一个数字，每个数字是修饰符的代号，修饰符包括访问权限、final，static等
            System.out.println(i);
            //将代号数字转换为字符串
            String modifierString =Modifier.toString(i);
            System.out.println(modifierString);
            //获取数据类型
            Class fieldType=field1.getType();
            String fieldTypeName=fieldType.getName();
            //获取属性名
            String fieldName=field1.getName();
            System.out.println(fieldName);
        }


    }
}
