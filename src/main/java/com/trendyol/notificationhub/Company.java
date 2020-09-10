/*
*  TO DO
*
*   1. date farkina gore kara listeye almak
*   2. her method icin unit test yazimi
*   3. javadoc
*   4. iki tarih arasi hesaplama yapan method baska bir classta implement edilecek
*
*   yonca.karagoz
*   9 Eylul 2020
*
* */

package com.trendyol.notificationhub;


import com.trendyol.notificationhub.enums.Language;
import com.trendyol.notificationhub.packages.Package;
import com.trendyol.notificationhub.user.IUser;


import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Company {

    List<Package> packages;
    List<IUser> users;


    private Date dateOfRegistration;
    protected boolean isInBlackList;
    private Language chosenLanguage;
    private  double totalBill;


    public Company(List<Package> packages, List<IUser> users, Language chosenLanguage) {
        this.packages = packages;
        this.users = users;
        this.chosenLanguage = chosenLanguage;

    }

    public Company() {
        this.packages = new LinkedList<Package>();
        this.users = new LinkedList<IUser>();
        this.totalBill = 0;
        this.isInBlackList = false;
        this.chosenLanguage = Language.French;
        this.dateOfRegistration = new Date();
    }

    public boolean payBill(){
        System.out.println(String.format("%.2f", totalBill) + " was paid!");
        totalBill = 0;
        return true;
    }


    public boolean checkUnpaidBill(){
        return totalBill != 0;
    }

    public void sendNotification(Package _package, IUser _user, String _message) {
        _package.sendMessage();
        System.out.println("Message send to " + _user.toString());
    }

    public void  sendNotificationAllUser(Package _p, String _m)  {
        for (IUser _user :  users)
            sendNotification(_p, _user, _m);
    }

    public void buyPackage(Package _package){
        packages.add(_package);
        totalBill += _package.calculateBill();
    }

   public void  addUser(IUser _user){
        users.add(_user);
   }

}
