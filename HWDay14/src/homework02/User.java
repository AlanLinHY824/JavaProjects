package homework02;

/**
 * 2.编写用户类，属性：用户名、密码，身份证号，手机号
 * 要求：使用封装完成，要求密码长度在6---12范围内，身份证号码必须是18位，手机号必须是11位
 * 提示：当是字符串类型时，使用length()方法获取字符串的长度
 * 编写测试类，创建对象，通过调用set方法完成对属性赋值，通过调用get方法输出属性的值
 * @AlanLin 2020/6/16
 */
public class User {
    private String userName;
    private String password;
    private String idNum;
    private String tel;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()>=6 && password.length()<=12) {
            this.password = password;
        }
        else {
            System.out.println("密码长度应为6到12个字符，请重新设置");
        }
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        if (idNum.length()==18) {
            this.idNum = idNum;
        }
        else {
            System.out.println("身份证号码输入错误，应为18位的数字和字母组合（最后一位可以为字母）");
        }
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        if (tel.length()==11) {
            this.tel = tel;
        }
        else {
            System.out.println("手机号输入错误，应为长度为11的数字组合");
        }
    }
}
