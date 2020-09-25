package IO;

import java.io.*;

/**
 * @AlanLin 2020/7/9
 */
public class ByteStreamTest01 {
    public static void main(String[] args) {
        copy(new File("D:\\SF\\618应对(苏沪) (1).xlsx"),new File("D:\\个人\\618应对(苏沪) (1).xlsx"));
    }

    public static void copy(File inputFile,File outputFile){
        File input=inputFile;
        File output=outputFile;
        File[] filesInput=input.listFiles();
        for (int i = 0; i <filesInput.length ; i++) {
            if (!filesInput[i].isDirectory()){
            }
        }
//        InputStream inputStream;
//        OutputStream outputStream;
        try(InputStream inputStream= new FileInputStream(inputFile);OutputStream outputStream=new FileOutputStream(outputFile)) {
            int len=0;
            byte[] bytes=new byte[1024];
            while ((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
