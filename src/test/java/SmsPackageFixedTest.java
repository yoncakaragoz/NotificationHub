import com.trendyol.notificationhub.packages.SmsPackageFixed;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class SmsPackageFixedTest {

    @Test
    public void it_should_return_bill_correctly(){

        SmsPackageFixed s1 = new SmsPackageFixed();
        s1.numberOfPackageUsage = 100;
        SmsPackageFixed s2 = new SmsPackageFixed();
        s2.numberOfPackageUsage = 1001;
        SmsPackageFixed s3 = new SmsPackageFixed();
        s3.numberOfPackageUsage = 0;


        List<SmsPackageFixed> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        double bill_s2 = s2.calculateBill();
        double bill_s3 = s3.calculateBill();



        Assert.assertTrue(bill_s1 == 20.0);
        Assert.assertTrue(bill_s2 == 40.0);
        Assert.assertTrue(bill_s3 == 20.0);
    }

    @Test
    public void it_should_return_bill_wrongly(){

        SmsPackageFixed s1 = new SmsPackageFixed();
        s1.numberOfPackageUsage = 100;
        SmsPackageFixed s2 = new SmsPackageFixed();
        s2.numberOfPackageUsage = 1001;
        SmsPackageFixed s3 = new SmsPackageFixed();
        s3.numberOfPackageUsage = 0;


        List<SmsPackageFixed> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        double bill_s2 = s2.calculateBill();
        double bill_s3 = s3.calculateBill();



        Assert.assertFalse(bill_s1 == 0.0);
        Assert.assertFalse(bill_s2 == 1.0);
        Assert.assertFalse(bill_s3 == 3.0);
    }




}
