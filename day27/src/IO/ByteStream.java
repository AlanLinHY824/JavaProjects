package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @AlanLin 2020/7/9
 */
public class ByteStream {
    public static void main(String[] args) throws Exception {
        copy();
        copyBatch();
    }
    public static void copy() throws Exception{
        InputStream inputStream= new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\异常.png");
        OutputStream outputStream= new FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\异常1.jpg");
        int b=0;
        while ((b=inputStream.read())!=-1){
            outputStream.write(b);
        }
        outputStream.close();
        inputStream.close();//先关输出流，再关输出流

    }
    //每次读写一批字节
    public static void copyBatch() throws Exception{
        InputStream inputStream= new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\异常.png");
        OutputStream outputStream= new FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\异常2.png");
        byte[] bytes=new byte[1024];
        int b=0;
        while ((b=inputStream.read(bytes))!=-1){
            //返回的是读取的字节长度，等于-1代表到达末尾，不一定每次都是1024，在末尾处会小于1024，此时b长度以后的数据未被覆盖，数组不可以全部写入
            //outputStream.write(bytes,起始下标,读取长度);
            outputStream.write(bytes,0,b);
        }
        outputStream.close();//先关输出流，再关输入流
        inputStream.close();
    }

}
