package demo2;

import java.text.MessageFormat;

/**
 * @Author: Matrix
 * @CreateDate: 2022-08-20 15:18:03
 * @Version: 1.0.1
 * @Description: Mail工具类
 */
public class MailUtil {

    public static void sendMail(Mail mail) {
        String outputContent = "向{0}用户,邮件地址:{1},邮件内容:{2}发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail) {
        System.out.println("存储originMail记录,originMail:" + mail.getContent());
    }
}
