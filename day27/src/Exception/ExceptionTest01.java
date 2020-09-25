package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try-with-resources语句
 *
 * @AlanLin 2020/7/9
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        //FileInputStream inputStream;
//        try {
//            inputStream = new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\java基础阶段测试1.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }


        //inputStream = new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\java基础阶段测试1.txt");

//        try {
//            inputStream.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                inputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //try(inputStream){//该资源对象会被隐式地声明为final变量，所以在此之前不能修改该资源对象的倾向
        try(FileInputStream inputStream = new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\01-JavaSE\\java基础阶段测试1.txt")){
            inputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("sad");


    }
}
