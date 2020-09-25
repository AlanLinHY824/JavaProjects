package chapter25.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * 通过反射机制，反编译
 * @AlanLin 2020/7/15
 */
public class ReflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException {

        StringBuilder stringBuilder=new StringBuilder();

        Class studentClass=Class.forName("chapter25.bean.Student");
        stringBuilder.append(Modifier.toString(studentClass.getModifiers())+"  class  "+studentClass.getSimpleName()+" {");
        Field[] fields=studentClass.getDeclaredFields();
        Method[] declaredMethods = studentClass.getDeclaredMethods();
        stringBuilder.append("\n");
        for (Field field : fields) {
            stringBuilder.append("\t");
            stringBuilder.append(Modifier.toString(field.getModifiers())+"  "+field.getType().getSimpleName()+"  "+field.getName());
            stringBuilder.append("\n");
        }
        for (Method declaredMethod : declaredMethods) {
            stringBuilder.append("\t");
            Parameter[] parameters = declaredMethod.getParameters();
            stringBuilder.append(Modifier.toString(declaredMethod.getModifiers())+"  "+declaredMethod.getReturnType().getSimpleName()+"  "+declaredMethod.getName()+"(");
            for (int i = 0; i < parameters.length; i++) {
                Parameter parameter = parameters[i];
                stringBuilder.append(parameter.getType().getSimpleName()+"  "+parameter.getName());
                if (i==parameters.length){
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append(")");
            stringBuilder.append("{");
            stringBuilder.append("}");
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder);

    }
}
