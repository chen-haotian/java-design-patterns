package demo2;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 15:18:31
 * @Version: 1.0.1
 * @Description: 客户端（使用方或者称为调用方）
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@selinux.tech");
            mailTemp.setContent("恭喜您，此次中奖了");
            MailUtil.sendMail(mailTemp);
            System.out.println("克隆的mailTemp:" + mailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
