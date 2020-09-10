import com.trendyol.notificationhub.packages.EmailPackageFlexible;
import com.trendyol.notificationhub.packages.SmsPackageFlexible;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class EmailPackageFlexibleTest {

    @Test
    public void it_should_return_bill_correctly(){

        EmailPackageFlexible s1 = new EmailPackageFlexible();
        s1.numberOfPackageUsage = 1999;
        EmailPackageFlexible s2 = new EmailPackageFlexible();
        s2.numberOfPackageUsage = 2001;
        EmailPackageFlexible s3 = new EmailPackageFlexible();
        s3.numberOfPackageUsage = 3000;


        List<EmailPackageFlexible> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        System.out.println(bill_s1);
        double bill_s2 = s2.calculateBill();
        System.out.println(bill_s2);
        double bill_s3 = s3.calculateBill();
        System.out.println(bill_s3);



        Assert.assertTrue(bill_s1 == 7.5);
        Assert.assertTrue(bill_s2 == 7.53);
        Assert.assertTrue(bill_s3 == 37.5);
    }

    @Test
    public void it_should_return_bill_wrongly(){

        EmailPackageFlexible s1 = new EmailPackageFlexible();
        s1.numberOfPackageUsage = 1999;
        EmailPackageFlexible s2 = new EmailPackageFlexible();
        s2.numberOfPackageUsage = 2001;
        EmailPackageFlexible s3 = new EmailPackageFlexible();
        s3.numberOfPackageUsage = 3000;


        List<EmailPackageFlexible> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        System.out.println(bill_s1);
        double bill_s2 = s2.calculateBill();
        System.out.println(bill_s2);
        double bill_s3 = s3.calculateBill();
        System.out.println(bill_s3);



        Assert.assertFalse(bill_s1 == 1.0);
        Assert.assertFalse(bill_s2 == 2.1);
        Assert.assertFalse(bill_s3 == 10.0);
    }
}
