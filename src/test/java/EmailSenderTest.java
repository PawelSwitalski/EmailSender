import javax.mail.MessagingException;

public class EmailSenderTest {
    public static void main(String[] args) {
        EmailSender sender = new EmailSender("email", "password");
        try {
            sender.sendMail("toEmail", "title", "message");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
