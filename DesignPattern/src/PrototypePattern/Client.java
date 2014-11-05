package PrototypePattern;

public class Client {
    private static int MAX_COUNT = 7;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("本版权归俺所有");
        Mail cloneMail;
        while (i < MAX_COUNT) {
            cloneMail = (Mail) mail.clone();
            cloneMail.setAppellation(i + "号");
            cloneMail.setReceiver("接受" + i + "号邮件");
            sendMail(cloneMail);
            i++;
        }

    }

    private static void sendMail(Mail mail) {
        System.out.println(mail.hashCode() + ":" + mail.getAppellation() + mail.getReceiver());
    }
}
