package mx.com.mtlsa.billing.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import com.metalsa.bl.PayrollBL;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.BodyPart;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
//import static javax.servlet.SessionTrackingMode.URL;
//import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
//import com.sun.mail.util.MailLogger;
import java.text.SimpleDateFormat;
import java.util.UUID;

public class Mailer {
   
    private Properties props;
    private Properties conf;
    private static ResourceBundle rb;
    private static String config = "/com/metalsa/utils/db";
    
    public Mailer(String type) {
        
        if(type.equals("US")) {
            
            Properties props =  new Properties();
            props.put("mail.smtp.host", "mail.metalsa.com");
            props.put("mail.smtp.port", 25);
            props.put("mail.smtp.ssl.trust", "mail.metalsa.com");
            props.put("mail.smtp.starttls.enable", false);
            props.put("mail.smtp.auth", false);
            props.put("mail.smtp.ehlo", false);
            props.put("mail.smtp.connectiontimeout", 10000);
            this.props=props;

            Properties config = new Properties();
            config.put("mail.user", "red.ap.invoices.mx@metalsa.com");
            config.put("mail.password", "Metalsa2019");
            config.put("mail.from", "red.ap.invoices.mx@metalsa.com");
            config.put("mail.name", "RED AP Invoices MX");
            this.conf=config;
        } else if(type.equals("ROA")) {
            
            Properties props =  new Properties();
            props.put("mail.smtp.host", "smtp.office365.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "false");
            this.props=props;

            Properties config = new Properties();
            config.put("mail.user", "roanoke_ap_invoices@metalsa.com");
            config.put("mail.password", "h/Xa.E7N6rB!");
            config.put("mail.from", "roanoke_ap_invoices@metalsa.com");
            config.put("mail.name", "RED AP Invoices Roanoke");
            this.conf=config;
        } else if(type.equals("TH")) {
            
            Properties props =  new Properties();
            props.put("mail.smtp.host", "smtp.office365.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "false");
            this.props=props;

            Properties config = new Properties();
            config.put("mail.user", "thailand_ap_invoices@metalsa.com");
            config.put("mail.password", "52ZDyJ5qrK=L>qX*");
            config.put("mail.from", "thailand_ap_invoices@metalsa.com");
            config.put("mail.name", "RED AP Invoices Thailand");
            this.conf=config;
        } else if(type.equals("IN")) {
            
            Properties props =  new Properties();
            props.put("mail.smtp.host", "smtp.office365.com");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "false");
            this.props=props;

            Properties config = new Properties();
            config.put("mail.user", "india_ap_invoices@metalsa.com");
            config.put("mail.password", "z:EM\\uvsY9.2>((D");
            config.put("mail.from", "india_ap_invoices@metalsa.com");
            config.put("mail.name", "RED AP Invoices India");
            this.conf=config;
        } else {
            Properties props =  new Properties();
            props.put("mail.smtp.host", "mail.metalsa.com");
            props.put("mail.smtp.port", 25);
            props.put("mail.smtp.ssl.trust", "mail.metalsa.com");
            props.put("mail.smtp.starttls.enable", false);
            props.put("mail.smtp.auth", false);
            props.put("mail.smtp.ehlo", false);
            props.put("mail.smtp.connectiontimeout", 10000);
            this.props=props;

            Properties config = new Properties();
            config.put("mail.user", "proveedoresfe");
            config.put("mail.password", "metalsa1");
            config.put("mail.from", "proveedores@metalsa.com");
            config.put("mail.name", "Metalsa Factura Electrónica");
            this.conf=config;
        }
    }
    
    public boolean send(String msgSubject, String msgContent, ArrayList to, String name,HashMap<String,InputStream> inputStreamFiles, String mailer, String mailer_from, String mailer_name, ArrayList mailer_copy) throws IOException{
        try {

          Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(conf.getProperty("mail.user"),conf.getProperty("mail.password"));
                               }
                     });

          session.setDebug(false);	
          InternetAddress fromAddress;
          
          if(mailer_from!=null) {
              fromAddress = new InternetAddress(mailer_from, mailer_name);
          } else {
              fromAddress = new InternetAddress(conf.getProperty("mail.from"), conf.getProperty("mail.name"));
          }
          
          Message msg = new MimeMessage(session);
          msg.setFrom(fromAddress);
          msg.setSubject(msgSubject);
          //TEST MAILS
          System.out.println("\tSending to:"+to.toString());
//          ArrayList<String> to_mails = new ArrayList();
//          to_mails.add("roberto.castillo.conde@metalsa.com");
//          to=to_mails;
          for (Object object: to) {
              InternetAddress toAddress = new InternetAddress((String)object);
              msg.addRecipient(Message.RecipientType.TO,toAddress);
          }
          
          if(mailer_copy!=null) {
            for (Object object: mailer_copy) {
                InternetAddress toAddress = new InternetAddress((String)object);
                msg.addRecipient(Message.RecipientType.CC,toAddress);
            }
          }
          
          if(mailer_from!=null) {
              msg.addRecipient(Message.RecipientType.CC,fromAddress);
          }
          
          MimeBodyPart mainPart = new MimeBodyPart();

          mainPart.setText(msgContent, "utf-8", "html");

          

          
          
          
          Multipart multipart = new MimeMultipart();
          multipart.addBodyPart(mainPart);
          
          
          /*Add Meeting*/
          if(mailer.equals("comservesp")){
          
            StringBuffer messageText = new StringBuffer();
            messageText.append("BEGIN:VCALENDAR\n" +
                               "PRODID:-//Microsoft Corporation//Outlook 9.0 MIMEDIR//EN\n" +
                               "VERSION:2.0\n" +
                               "METHOD:REQUEST\n" +
                                   "BEGIN:VEVENT\n" +
                                   "ORGANIZER:Metalsa" ) ;
            messageText.append( "\nDTSTART:20210608T190000Z");
            messageText.append( "\nDTEND:20210608T200000Z" ) ;
            messageText.append( "\nLOCATION:Teams" ) ;
            messageText.append( "\nATTENDEE;ROLE=REQ-PARTICIPANT;RSVP=TRUE:MAILTO:"+to.toString()) ;
            messageText.append( "\nUID:"+UUID.randomUUID().toString()) ;
            messageText.append( "\nDTSTAMP: 20210604T120000Z" ) ;
            messageText.append( "\nDESCRIPTION:https://teams.microsoft.com/l/meetup-join/19%3ameeting_YWUxY2I1NWItMWIyZC00ZTI1LWFhZjYtZGQwM2U3MzBmYWQ4%40thread.v2/0?context=%7b%22Tid%22%3a%2280f3ea7d-0e29-4591-9f60-bc5201a91499%22%2c%22Oid%22%3a%2280c7c3eb-70e9-46c6-af6b-068ef06c3a91%22%7d") ;
            messageText.append( "\n" +
                                        "BEGIN:VALARM\n" +
                                        "TRIGGER:-PT15M\n" +
                                        "ACTION:DISPLAY\n" +
                                        "DESCRIPTION:Reminder\n" +
                                        "END:VALARM\n" +
                                   "END:VEVENT\n" +
                               "END:VCALENDAR"
                               ) ;


            MimeBodyPart meetingPart = new MimeBodyPart() ;
            meetingPart.setHeader("Content-Class", "urn:content-  classes:calendarmessage");
            meetingPart.setHeader("Content-ID", "calendar_message");
            meetingPart.setDataHandler(new DataHandler(new ByteArrayDataSource(messageText.toString(), "text/calendar;method=REQUEST;charset=\"UTF-8\"")));// very important

            multipart.addBodyPart(meetingPart);

        }
          
        if(inputStreamFiles!=null&&inputStreamFiles.size()>0){
            for(Map.Entry<String, InputStream> entry : inputStreamFiles.entrySet()) {
                String key = entry.getKey();
                InputStream file = entry.getValue();
                String extension = key.split("\\.")[1];
                DataSource source = new ByteArrayDataSource(file, "application/"+extension);  
                BodyPart messageBodyPart = new MimeBodyPart();        
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(key);
                multipart.addBodyPart(messageBodyPart);
            }
        }           
        msg.setContent(multipart);
  

          Transport transport = session.getTransport("smtp");
          transport.connect();
          transport.sendMessage(msg, msg.getAllRecipients());
          return true;
     }
     catch (MessagingException e) {
         e.printStackTrace();
         return false;
     }
     catch (UnsupportedEncodingException e) {
         e.printStackTrace();
         return false;
     } catch (Exception e) {
         e.printStackTrace();
         return false;
     }
   }
    
    public boolean sendUS(String msgSubject, String msgContent, ArrayList to, String name,HashMap<String,InputStream> inputStreamFiles, String mailer, String mailer_from, String mailer_name, String mailer_copy) throws IOException{
        try {

          Session session = Session.getInstance(props, new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(conf.getProperty("mail.user"),conf.getProperty("mail.password"));
                               }
                     });

          session.setDebug(false);	
          InternetAddress fromAddress;
          
          if(mailer_from!=null) {
              fromAddress = new InternetAddress(mailer_from, mailer_name);
          } else {
              fromAddress = new InternetAddress(conf.getProperty("mail.from"), conf.getProperty("mail.name"));
          }
          
          Message msg = new MimeMessage(session);
          msg.setFrom(fromAddress);
          msg.setSubject(msgSubject);
          //TEST MAILS
          System.out.println("\tSending to:"+to.toString());
//          ArrayList<String> to_mails = new ArrayList();
//          to_mails.add("roberto.castillo.conde@metalsa.com");
//          to=to_mails;
          for (Object object: to) {
              InternetAddress toAddress = new InternetAddress((String)object);
              msg.addRecipient(Message.RecipientType.TO,toAddress);
          }
          
          if(mailer_from!=null) {
              msg.addRecipient(Message.RecipientType.CC,fromAddress);
          }
          
          if(mailer_copy!=null) {
              InternetAddress copyAddress = new InternetAddress(mailer_copy,"");
              msg.addRecipient(Message.RecipientType.BCC,copyAddress);
          }
          
          MimeBodyPart mainPart = new MimeBodyPart();

          mainPart.setText(msgContent, "utf-8", "html");

          

          
          
          
          Multipart multipart = new MimeMultipart();
          multipart.addBodyPart(mainPart);
          
          
          /*Add Meeting*/
          if(mailer.equals("comservesp")){
          
            StringBuffer messageText = new StringBuffer();
            messageText.append("BEGIN:VCALENDAR\n" +
                               "PRODID:-//Microsoft Corporation//Outlook 9.0 MIMEDIR//EN\n" +
                               "VERSION:2.0\n" +
                               "METHOD:REQUEST\n" +
                                   "BEGIN:VEVENT\n" +
                                   "ORGANIZER:Metalsa" ) ;
            messageText.append( "\nDTSTART:20210608T190000Z");
            messageText.append( "\nDTEND:20210608T200000Z" ) ;
            messageText.append( "\nLOCATION:Teams" ) ;
            messageText.append( "\nATTENDEE;ROLE=REQ-PARTICIPANT;RSVP=TRUE:MAILTO:"+to.toString()) ;
            messageText.append( "\nUID:"+UUID.randomUUID().toString()) ;
            messageText.append( "\nDTSTAMP: 20210604T120000Z" ) ;
            messageText.append( "\nDESCRIPTION:https://teams.microsoft.com/l/meetup-join/19%3ameeting_YWUxY2I1NWItMWIyZC00ZTI1LWFhZjYtZGQwM2U3MzBmYWQ4%40thread.v2/0?context=%7b%22Tid%22%3a%2280f3ea7d-0e29-4591-9f60-bc5201a91499%22%2c%22Oid%22%3a%2280c7c3eb-70e9-46c6-af6b-068ef06c3a91%22%7d") ;
            messageText.append( "\n" +
                                        "BEGIN:VALARM\n" +
                                        "TRIGGER:-PT15M\n" +
                                        "ACTION:DISPLAY\n" +
                                        "DESCRIPTION:Reminder\n" +
                                        "END:VALARM\n" +
                                   "END:VEVENT\n" +
                               "END:VCALENDAR"
                               ) ;


            MimeBodyPart meetingPart = new MimeBodyPart() ;
            meetingPart.setHeader("Content-Class", "urn:content-  classes:calendarmessage");
            meetingPart.setHeader("Content-ID", "calendar_message");
            meetingPart.setDataHandler(new DataHandler(new ByteArrayDataSource(messageText.toString(), "text/calendar;method=REQUEST;charset=\"UTF-8\"")));// very important

            multipart.addBodyPart(meetingPart);

        }
          
        if(inputStreamFiles!=null&&inputStreamFiles.size()>0){
            for(Map.Entry<String, InputStream> entry : inputStreamFiles.entrySet()) {
                String key = entry.getKey();
                InputStream file = entry.getValue();
                String extension = key.split("\\.")[1];
                DataSource source = new ByteArrayDataSource(file, "application/"+extension);  
                BodyPart messageBodyPart = new MimeBodyPart();        
                messageBodyPart.setDataHandler(new DataHandler(source));
                messageBodyPart.setFileName(key);
                multipart.addBodyPart(messageBodyPart);
            }
        }           
        msg.setContent(multipart);
  

          Transport transport = session.getTransport("smtp");
          transport.connect();
          transport.sendMessage(msg, msg.getAllRecipients());
          return true;
     }
     catch (MessagingException e) {
         e.printStackTrace();
         return false;
     }
     catch (UnsupportedEncodingException e) {
         e.printStackTrace();
         return false;
     } catch (Exception e) {
         e.printStackTrace();
         return false;
     }
   }
    

    public static String getDefaultTemplate() {
        String template = 
                "<html>\n" +
                "<table class=\"header centered\" style=\"border-collapse: collapse;border-spacing: 0;Margin-left: auto;Margin-right: auto;width: 100%;color: #c2c2c2;\">\n" +
                "        <tbody><tr>\n" +
                "          <td colspan='2' class=\"logo emb-logo-padding-box\" style=\"padding: 0;vertical-align: top;mso-line-height-rule: at-least;font-size: 24px;padding-top: 2px;padding-bottom: 27px;\">\n" +
                "            <div class=\"logo-left\" style=\"font-family: Roboto,Tahoma,sans-serif;color: #c3ced9;font-weight: bold;font-size: 0px !important;line-height: 0 !important;\" align=\"left\" id=\"emb-email-header\"><img style=\"border: 0;-ms-interpolation-mode: bicubic;display: block;max-width: 200px;\" src=\"%logo_url%\" alt=\"\" width=\"200\" height=\"53\"></div>\n" +
                "          </td>\n" +
//                "           <td><h1 class=\\\"size-32\\\" style=\\\"font-style: normal;font-weight: 400;Margin-bottom: 0;Margin-top: 0;font-size: 32px;line-height: 40px;font-family: Lato,Tahoma,sans-serif;color: #b8bdc9;text-align: center;\\\">Factura Electrónica</h1><p class=\\\"size-17\\\" style=\\\"font-style: normal;font-weight: 400;Margin-bottom: 0;Margin-top: 24px;font-size: 17px;line-height: 26px;font-family: Lato,Tahoma,sans-serif;color: #595959;\"></td>"+
                "        </tr>\n" +
                "      </tbody></table>\n" +
                "	  \n" +
                "	  <table class=\"one-col centered\" style=\"border-collapse: collapse;border-spacing: 0;Margin-left: auto;Margin-right: auto;width: 100%;table-layout: fixed;background-color: #fafafa;\">\n" +
                "            <tbody><tr>\n" +
                "              <td class=\"column\" style=\"padding: 0;vertical-align: top;text-align: left;\">\n" +
                "                <div><div class=\"column-top\" style=\"font-size: 20px;line-height: 20px;transition-timing-function: cubic-bezier(0, 0, 0.2, 1);transition-duration: 150ms;transition-property: all;\">&nbsp;</div></div>\n" +
                "                  <table class=\"contents\" style=\"border-collapse: collapse;border-spacing: 0;table-layout: fixed;width: 100%;\">\n" +
                "                    <tbody><tr>\n" +
                "                      <td class=\"padded\" style=\"padding: 0;vertical-align: top;padding-left: 20px;padding-right: 20px;word-break: break-word;word-wrap: break-word;\">\n" +
                "                        \n" +
                "                       %content%</p>\n" +
                "          \n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </tbody></table>\n" +
                "                \n" +
                "                  <table class=\"contents\" style=\"border-collapse: collapse;border-spacing: 0;table-layout: fixed;width: 100%;\">\n" +
                "                    <tbody><tr>\n" +
                "                      <td class=\"padded\" style=\"padding: 0;vertical-align: top;padding-left: 20px;padding-right: 20px;word-break: break-word;word-wrap: break-word;\">\n" +
                "                        \n" +
                "            <div style=\"line-height:10px;font-size:1px\">&nbsp;</div>\n" +
                "          \n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </tbody></table>\n" +
                "                \n" +
                "                  <table class=\"contents\" style=\"border-collapse: collapse;border-spacing: 0;table-layout: fixed;width: 100%;\">\n" +
                "                    <tbody><tr>\n" +
                "                      <td class=\"padded\" style=\"padding: 0;vertical-align: top;padding-left: 20px;padding-right: 20px;word-break: break-word;word-wrap: break-word;\">\n" +
                "                        \n" +
                "            <div style=\"line-height:7px;font-size:1px\">&nbsp;</div>\n" +
                "          \n" +
                "                      </td>\n" +
                "                    </tr>\n" +
                "                  </tbody></table>\n" +
                "                \n" +
                "                <div class=\"column-bottom\" style=\"font-size: 20px;line-height: 20px;transition-timing-function: cubic-bezier(0, 0, 0.2, 1);transition-duration: 150ms;transition-property: all;\"><img src=\"https://cloud.metalsa.com/IFP/tk?kp=%token%\" width=1 height=1></div>\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </tbody></table>\n" +
                "</html>";
        return template;
  }
    
    
    public static String getForApprovalTemplate() {
        String template = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" xmlns:x=\"urn:schemas-microsoft-com:office:excel\" xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\" xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\"><meta name=Generator content=\"Microsoft Word 14 (filtered medium)\"></head><body lang=ES-MX link=blue vlink=purple><div class=\"WordSection1\"><p class=\"MsoNormal\"><span lang=EN-US>Dear User, </span></p>"
                + "<p><span lang=EN-US>The following invoices has a waiting status (%reason%), we need your approval to process it for payment</span></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%list_invoices%</li></ul></p>"
                + "<p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p><p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p></div></body></html>";
        return template;
    }   
    
    public static String getHoldContactTemplate() {
        String template = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" xmlns:x=\"urn:schemas-microsoft-com:office:excel\" xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\" xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\"><meta name=Generator content=\"Microsoft Word 14 (filtered medium)\"></head><body lang=ES-MX link=blue vlink=purple><div class=\"WordSection1\"><p class=\"MsoNormal\"><span lang=EN-US>Dear User, </span></p>"
                + "<p><span lang=EN-US>The following invoices has a waiting status (%reason%), we need your review to process it for payment</span></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%list_invoices%</li></ul></p>"
                + "<p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p><p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p></div></body></html>";
        return template;
    }  
    
    
    public static String getOnHoldFCAReport() {
        String template = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" xmlns:x=\"urn:schemas-microsoft-com:office:excel\" xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\" xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\"><meta name=Generator content=\"Microsoft Word 14 (filtered medium)\"></head><body lang=ES-MX link=blue vlink=purple><div class=\"WordSection1\"><p class=\"MsoNormal\"><span lang=EN-US>Buen día, </span></p>"
                + "<p><span lang=EN-US>Anexamos el reporte de facturas en error de validación de FCA MÉXICO S.A. DE C.V. al día de hoy;</span></p>"
                + "<p><span lang=EN-US>Si tiene alguna duda relacionada a éste, puede comunicarse con:</span></p>"
                + "<p><span lang=EN-US>Oscar Saldúa  oscar.saldua@metalsa.com</span></p>"
                + "<p><span lang=EN-US>Agradecemos su pronto apoyo.</span></p>"
                + "<p><span lang=EN-US>Saludos!</span></p>"
                + "<p class=\"MsoNormal\"><span lang=EN-US><b>Nota: Este mail es un mensaje automático POR FAVOR NO CONTESTE A ESTE EMAIL.</bold></span></p></div></body></html>";
        return template;
    }               
    
    public static String getOnHoldReport() {
        String template = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" xmlns:x=\"urn:schemas-microsoft-com:office:excel\" xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\" xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\"><meta name=Generator content=\"Microsoft Word 14 (filtered medium)\"></head><body lang=ES-MX link=blue vlink=purple><div class=\"WordSection1\"><p class=\"MsoNormal\"><span lang=EN-US>Buen día, </span></p>"
                + "<p><span lang=EN-US>Anexamos el reporte de facturas “on hold” de proveedores productivos extranjeros al día de hoy; la misma información es presentada en diferentes escenarios para facilitar su lectura.</span></p>"
                + "<p><span lang=EN-US>Favor de revisarlo con su equipo para poder registrar y pagar estas facturas lo antes posible y evitar futuros problemas de abastecimiento con éstos proveedores.</span></p>"
                + "<p><span lang=EN-US>Si tiene alguna duda relacionada a éste, puede comunicarse con:</span></p>"
                + "<p><span lang=EN-US>Mariana Martinez  mariana.martinez@metalsa.com</span></p>"
                + "<p><span lang=EN-US>Daira Rodriguez    daira.rodriguez@metalsa.com</span></p>"
                + "<p><span lang=EN-US>Liliana Silva      liliana.silva@metalsa.com</span></p>"
                + "<p><span lang=EN-US>Agradecemos su pronto apoyo.</span></p>"
                + "<p><span lang=EN-US>Saludos!</span></p>"
                + "<p class=\"MsoNormal\"><span lang=EN-US><b>Nota: Este mail es un mensaje automático POR FAVOR NO CONTESTE A ESTE EMAIL.</bold></span></p></div></body></html>";
        return template;
    }   
    
    public static String getSummaryTemplate() {
        String template = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" xmlns:x=\"urn:schemas-microsoft-com:office:excel\" xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\" xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\"><meta name=Generator content=\"Microsoft Word 14 (filtered medium)\"></head><body lang=ES-MX link=blue vlink=purple><div class=\"WordSection1\"><p class=\"MsoNormal\"><span lang=EN-US>Dear User, </span></p>"
                + "<p><span lang=EN-US>This is the summary of status per day and accumulated.</span></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%daily_report%</li></ul></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%accumulative_report%</li></ul></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%onhold_report%</li></ul></p>"
                + "<p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p><p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p></div></body></html>";
        return template;
    } 
    
     public static String getGontorTemplate() {
        String template = "<html xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" xmlns:x=\"urn:schemas-microsoft-com:office:excel\" xmlns:m=\"http://schemas.microsoft.com/office/2004/12/omml\" xmlns=\"http://www.w3.org/TR/REC-html40\"><head><meta http-equiv=Content-Type content=\"text/html; charset=iso-8859-1\"><meta name=Generator content=\"Microsoft Word 14 (filtered medium)\"></head><body lang=ES-MX link=blue vlink=purple><div class=\"WordSection1\"><p class=\"MsoNormal\"><span lang=EN-US> </span></p>"
                + "<p><span lang=EN-US>Resumen de facturas tramitadas en FTTS-Buzón.</span></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%daily_report%</li></ul></p>"
                + "<p style=\"margin-left:.5in;text-indent:-.25in;mso-list:l0 level1 lfo2\"><ul><li>%error_detail%</li></ul></p>"
                + "<p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p><p class=\"MsoNormal\"><span lang=EN-US>&nbsp;</span></p></div></body></html>";
        return template;
    }  
    
    public static String getTableTemplate() {
        String template = "<table  border=\"1\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" width=\"500\">\n" +
                "  <caption>%title_table%</caption>\n" +
                "  <tr>\n" +
                "    %header_columns% \n" +
                "  </tr>\n" +
                "  %row_content%\n" +
                "</table>";
        return template;
    }   
}