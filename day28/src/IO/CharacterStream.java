package IO;

import java.io.*;

/**
 * @AlanLin 2020/7/10
 */
public class CharacterStream {
    public static void main(String[] args) {
        //readBatch();
        //read();
        write();
        writeByReader();
        bufferedReader();
    }

    public static void read(){
        try (InputStream is=new  FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\06.流.txt");
             Reader reader=new InputStreamReader(is,"GBK")){
            int c;
            while ((c=reader.read())!=-1){
                char ch=(char)c;
                System.out.print(ch);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void readBatch(){
        try (InputStream is=new  FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\06.流.txt");
             Reader reader=new InputStreamReader(is,"GBK")){
            int len;
            char[] chars=new char[1024];//2k，因为Java中字符占两个字节
            while ((len=reader.read(chars))!=-1){
                System.out.print(new String(chars,0,len));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void write(){
        try (OutputStream os=new  FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\字符写入测试0.txt");
             OutputStreamWriter writer=new OutputStreamWriter(os,"GBK")){
            System.out.println(writer.getEncoding());
                 writer.write("字符流写入测试");
                 writer.write("\r\n");
                 writer.write("第二行字符");
            } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void writeByReader(){
        try (OutputStream os=new FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\字符写入测试.txt");
             OutputStreamWriter writer=new OutputStreamWriter(os);InputStream is=new  FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\06.流.txt");
             InputStreamReader reader=new InputStreamReader(is)){
            System.out.println(writer.getEncoding());
            System.out.println(reader.getEncoding());
            int c;
            while ((c=reader.read())!=-1){
                char ch=(char)c;
                //System.out.print(ch);
                writer.write(c);

            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //使用缓冲流读取,带有缓冲区，提前读取下一行，避免频繁的读取请求
    //设计模式：包装的思想
    //字符流包装字节流--->可以读取字符的字节流，缓冲区包装字符流--->带有缓冲区的字符流
    public static void bufferedReader(){
        try(InputStream is=new  FileInputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\06.流.txt");
            Reader reader=new InputStreamReader(is,"GBK");
            BufferedReader br=new BufferedReader(reader)){
            String str;
            while ((str=br.readLine())!=null){//识别换行符，自动按行取出，不会读取任何行中止符，换行符，如果需要写入换行符，建议使用Bufferedwriter
                System.out.println(str);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    //使用缓冲流写入,先将需要写入的内容放入缓冲区，集中写入，避免每次调用方法时都写入，避免频繁的写入请求
    public static void bufferedWriter(){
        try(OutputStream os=new  FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\Buffered字符写入测试.txt.txt");
            Writer writer=new OutputStreamWriter(os,"GBK");
            BufferedWriter bw=new BufferedWriter(writer)){
            bw.write("测试");
            bw.newLine();
            bw.write("BufferedWriter测试");
            bw.write("正文");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    //PrintWriter
    public static void printWriter(){
//        try(OutputStream os=new  FileOutputStream("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\Buffered字符写入测试.txt.txt");
//            Writer writer=new OutputStreamWriter(os,"GBK");
//            BufferedWriter bw=new BufferedWriter(writer);
//            PrintWriter pw=new PrintWriter(bw)){
//            pw.println("asdasd");
//            pw.print("kldfklsf");
//        } catch (Exception e){
//            e.printStackTrace();
//        }
        try(PrintWriter pw=new PrintWriter("D:\\学习资料\\Java学习\\动力节点\\02-Java进阶\\0709\\Buffered字符写入测试.txt.txt")){//直接创建，这一行代码效果相当于上面四行的创建代码，源代码:this(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName))),false);
            pw.println();
        }catch (Exception e){

        }



    }

}
