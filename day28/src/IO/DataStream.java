package IO;

import java.io.*;

/**
 * 数据流
 * @AlanLin 2020/7/10
 */
public class DataStream {
    public static void main(String[] args) {
        write();
        read();
    }

    //数据流的写操作，写入操作完全按照java的编码方式
    public static void write(){
        try(OutputStream os=new FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0710\\test");
            DataOutputStream dataOutputStream=new DataOutputStream(os)){
            dataOutputStream.writeUTF("id:");
            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF(",name:张三，age：");
            dataOutputStream.writeInt(20);
            dataOutputStream.writeUTF("，price");
            dataOutputStream.writeDouble(9.9);
            dataOutputStream.writeUTF("，是否在校：");
            dataOutputStream.writeBoolean(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //数据流的读操作
    public static void read(){
        try(InputStream is=new FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0710\\test");
            DataInputStream inputStream=new DataInputStream(is)){
            System.out.print(inputStream.readUTF());
            System.out.print(inputStream.readInt());
            System.out.print(inputStream.readUTF());
            System.out.print(inputStream.readInt());
            System.out.print(inputStream.readUTF());
            System.out.print(inputStream.readDouble());
            System.out.print(inputStream.readUTF());
            System.out.print(inputStream.readBoolean());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
