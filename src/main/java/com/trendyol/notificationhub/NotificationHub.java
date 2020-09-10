package com.trendyol.notificationhub;


import com.trendyol.notificationhub.exceptions.BlackListException;

public class NotificationHub {


    public boolean provideService(Company _c) throws BlackListException {

        if(_c.checkUnpaidBill()){
            throw new BlackListException("The company is in blacklist / Pay the bill! ");
        }

        return true;
    }



}
