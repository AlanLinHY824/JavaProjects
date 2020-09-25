package IO;

import java.io.*;

/**
 * @AlanLin 2020/7/18
 */
public class FileCopyUtil {
    static int count1=0;
    public static void main(String[] args) {
//        File file=new File("D:\\学习资料\\Java学习\\动力节点\\03-JavaWeb");
//        showAllFiles(file);
        //            copyAllFiles("D:\\学习资料\\Java学习\\帮助文档","D:\\学习资料\\Java学习\\动力节点");
        copyAllFiles("D:\\学习资料\\Java学习\\帮助文档\\AJAX开发手册\\[AJAX完全手册].（美）波维尔.扫描版.pdf","D:\\学习资料\\Java学习\\动力节点");

    }
    public static int showAllFiles(String pathname){
        File file=new File(pathname);
        System.out.println("文件夹："+ pathname);
        File[] filesInput= file.listFiles();
        int count=0;
        int count2=0;
        assert filesInput != null;
        for (int i = 0; i <filesInput.length ; i++) {
            if (filesInput[i].isDirectory()){
                count+=showAllFiles(filesInput[i].toString());
                count2++;
            }else {
                System.out.print("文件：");
                System.out.println(filesInput[i]);
                count++;
                count1++;
            }
        }
        System.out.println("文件夹\""+ pathname +"\"中的文件夹总数："+count2);
        System.out.println("文件夹\""+ pathname +"\"中的文件总数："+count);
        //System.out.println("该目录下的文件夹中的累计文件数量："+count1);
        return count;
    }

    /**
     * @param srcFileName 需要复制的文件或文件夹
     * @param destDirectory  目标文件夹
     */
    public static void copyAllFiles(String srcFileName,String destDirectory) {
        File inputFile=new File(srcFileName);
        String outFileDirectory=destDirectory;
        if (inputFile.isDirectory()){
            outFileDirectory=destDirectory+"\\"+srcFileName.substring(srcFileName.lastIndexOf("\\")+1);
            File outputFile=new File(outFileDirectory);
            if (!outputFile.exists()){
                outputFile.mkdirs();
            }
            File[] filesInput= inputFile.listFiles();
            for (int i = 0; i <filesInput.length ; i++) {
                String fileName = filesInput[i].toString();
                String outFileName=outFileDirectory+"\\"+fileName.substring(fileName.lastIndexOf("\\")+1);
                File outputFile1=new File(outFileName);
                if (filesInput[i].isDirectory()){
                    outputFile.mkdirs();
                    copyAllFiles(filesInput[i].toString(),outFileName);
                }else {
                    try {
                        InputStream inputStream=new FileInputStream(filesInput[i]);
                        OutputStream outputStream=new FileOutputStream(outputFile1);
                        byte[] bytes=new byte[2048];
                        int len=0;
                        while ((len=inputStream.read(bytes))!=-1){
                            outputStream.write(bytes, 0, len);
                            outputStream.flush();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }else {
            try {
                String outFileName=outFileDirectory+"\\"+srcFileName.substring(srcFileName.lastIndexOf("\\")+1);
                File outputFile=new File(outFileName);
                InputStream inputStream=new FileInputStream(srcFileName);
                OutputStream outputStream=new FileOutputStream(outputFile);
                byte[] bytes=new byte[2048];
                int len=0;
                while ((len=inputStream.read(bytes))!=-1){
                    outputStream.write(bytes, 0, len);
                    outputStream.flush();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
