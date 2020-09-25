package Exception.IOS;

import java.io.IOException;

/**
 * @AlanLin 2020/7/9
 */
public class Test {
    public static void main(String[] args) {
//        IOSUpdate iosUpdate=new IOSUpdate();
//        try {
//            iosUpdate.update();
//        } catch (MyException e) {
//            e.printStackTrace();
//            iosUpdate.rollback();
//        }finally {
//            iosUpdate.clear();
//        }
        IOSUpdate iosUpdate=new IOSUpdate();
        try(iosUpdate){
            iosUpdate.update();
        }catch (MyException | IOException e){
            e.printStackTrace();
            iosUpdate.rollback();
        }

    }
}
