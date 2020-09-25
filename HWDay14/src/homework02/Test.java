package homework02;

/**
 * @AlanLin 2020/6/16
 */
public class Test {
    public static void main(String[] args) {
        User user1=new User();
        user1.setUserName("张三");
        user1.setIdNum("310235424554866546");
        user1.setPassword("4455464");
        user1.setTel("17695456935");
        System.out.println("用户名："+user1.getUserName());
        System.out.println("用户身份证号码："+user1.getIdNum());
        System.out.println("用户密码："+user1.getPassword());
        System.out.println("用户手机号码："+user1.getTel());
    }
}
