import com.trendyol.notificationhub.*;
import com.trendyol.notificationhub.packages.EmailPackageFixed;
import com.trendyol.notificationhub.packages.Package;
import com.trendyol.notificationhub.packages.SmsPackageFlexible;
import com.trendyol.notificationhub.user.IUser;
import com.trendyol.notificationhub.user.User;

public class Main {

    public static void main(String[] args)  {


        Package sms = new SmsPackageFlexible();
        Package email = new EmailPackageFixed();


       for (int i=0; i<5000; i++){
           sms.sendMessage();
           email.sendMessage();
       }

        System.out.println(sms.calculateBill());
        System.out.println(email.calculateBill());


        IUser u_1 = new User("Trendyol");
        IUser u_2 = new User("Yonca");
        IUser u_3 = new User("Cennet");

        Company c = new Company();

        c.buyPackage(sms);
        c.buyPackage(email);
        c.payBill();

        c.addUser(u_1);
        c.addUser(u_2);
        c.addUser(u_3);

        c.sendNotificationAllUser(sms, "Test message");

        NotificationHub nh = new NotificationHub();
        nh.provideService(c);

    }
}
