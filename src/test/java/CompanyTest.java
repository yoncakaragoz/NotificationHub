import com.trendyol.notificationhub.Company;
import com.trendyol.notificationhub.packages.EmailPackageFixed;
import com.trendyol.notificationhub.packages.SmsPackageFlexible;
import com.trendyol.notificationhub.user.User;
import org.junit.Assert;
import org.junit.Test;

public class CompanyTest {

    @Test
    public void it_should_return_bill_method_calculate_bill(){

        Company company = new Company();
        EmailPackageFixed p = new EmailPackageFixed();

        for(int i=0; i<8; i++){
            p.sendMessage();
        }

        double bill = p.calculateBill();
        System.out.println(bill);

        Assert.assertTrue(bill == 10.00);
    }
}
