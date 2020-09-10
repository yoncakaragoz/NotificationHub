import com.trendyol.notificationhub.packages.EmailPackageFixed;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class EmailPackageFixedTest {

    @Test
    public void it_should_return_bill_correctly(){

        EmailPackageFixed s1 = new EmailPackageFixed();
        s1.numberOfPackageUsage = 100;
        EmailPackageFixed s2 = new EmailPackageFixed();
        s2.numberOfPackageUsage = 1001;
        EmailPackageFixed s3 = new EmailPackageFixed();
        s3.numberOfPackageUsage = 0;


        List<EmailPackageFixed> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        System.out.println(bill_s1);
        double bill_s2 = s2.calculateBill();
        System.out.println(bill_s2);
        double bill_s3 = s3.calculateBill();
        System.out.println(bill_s3);



        Assert.assertTrue(bill_s1 == 10.0);
        Assert.assertTrue(bill_s2 == 20.0);
        Assert.assertTrue(bill_s3 == 10.0);
    }

    @Test
    public void it_should_return_bill_wrongly(){

        EmailPackageFixed s1 = new EmailPackageFixed();
        s1.numberOfPackageUsage = 100;
        EmailPackageFixed s2 = new EmailPackageFixed();
        s2.numberOfPackageUsage = 1001;
        EmailPackageFixed s3 = new EmailPackageFixed();
        s3.numberOfPackageUsage = 0;


        List<EmailPackageFixed> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        double bill_s2 = s2.calculateBill();
        double bill_s3 = s3.calculateBill();



        Assert.assertFalse(bill_s1 == 20.0);
        Assert.assertFalse(bill_s2 == 40.0);
        Assert.assertFalse(bill_s3 == 20.0);
    }

}
