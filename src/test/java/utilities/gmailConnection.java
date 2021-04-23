package utilities;

import javax.mail.*;
import java.util.Properties;

public class gmailConnection {
        public static void connectAndVerifyGmailSubject(String subject) throws MessagingException {
            try {
                Folder inbox = null;
                Store store = null;
                // create properties field
                Properties properties = new Properties();
                properties.setProperty("mail.store.protocol", "imaps");
                Session emailSession = Session.getInstance(properties);
                emailSession.setDebug(true);
// create the Imap store object and connect with the Store
                store = emailSession.getStore("imaps");
                // Change Email and Password as required
                store.connect("imap.googlemail.com", "chiragh.e2e@gmail.com", "Chiragh@e2e");
                System.out.println("Connection made");
// create the folder object and open it
                inbox = store.getFolder("INBOX");
                inbox.open(Folder.READ_ONLY);
                Message message = null;
                Message[] messages = inbox.getMessages();
                // fetching the messages from the inbox in an array and counting it
                System.out.println(" total number of emails " + inbox.getMessageCount());
                for (int i = messages.length - 1; i >= 0; i--) {
                    if (messages != null && messages[i].getSubject() != null && subject.trim().replaceAll(" ", "").equalsIgnoreCase(messages[i].getSubject().trim().replaceAll(" ", ""))) {
                        System.out.println("I ::" + i);
                        System.out.println("SUBJECT ::" + messages[i].getSubject());
                        message = messages[i];
                        break;
                    }
                    System.out.println(" MESSAGE ::" + message);
                    if (inbox != null && inbox.isOpen())
                        inbox.close(true);
                    if (store != null && store.isConnected())
                        store.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

            public static void main(String[] args) throws MessagingException {
// TODO Auto-generated method stub
                    String subject="Forgot Your Chiragh Password?";
                    connectAndVerifyGmailSubject(subject);
                }
            }


