/*
*
*   SORU:
*
*   Test dosyalarinda kod tekrarina nasıl dusulmez ?
*   Iyi unit test Java'da nasil yazilir ?
*
*
* */



import com.trendyol.notificationhub.packages.SmsPackageFlexible;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class SmsPackageFlexibleTest {

    @Test
    public void it_should_return_bill_correctly(){

        SmsPackageFlexible s1 = new SmsPackageFlexible();
        s1.numberOfPackageUsage = 1999;
        SmsPackageFlexible s2 = new SmsPackageFlexible();
        s2.numberOfPackageUsage = 2001;
        SmsPackageFlexible s3 = new SmsPackageFlexible();
        s3.numberOfPackageUsage = 3000;


        List<SmsPackageFlexible> sms = new LinkedList<>();
        sms.add(s1); sms.add(s2); sms.add(s3);


        double bill_s1 = s1.calculateBill();
        System.out.println(bill_s1);
        double bill_s2 = s2.calculateBill();
        System.out.println(bill_s2);
        double bill_s3 = s3.calculateBill();
        System.out.println(bill_s3);



        Assert.assertTrue(bill_s1 == 30.0);
        Assert.assertTrue(bill_s2 == 30.1);
        Assert.assertTrue(bill_s3 == 130.0);
    }

    @Test
    public void it_should_return_bill_wrongly(){

        SmsPackageFlexible s1 = new SmsPackageFlexible();
        s1.numberOfPackageUsage = 1999;
        SmsPackageFlexible s2 = new SmsPackageFlexible();
        s2.numberOfPackageUsage = 2001;
        SmsPackageFlexible s3 = new SmsPackageFlexible();
        s3.numberOfPackageUsage = 3000;


        List<SmsPackageFlexible> sms = new LinkedList<>();
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

