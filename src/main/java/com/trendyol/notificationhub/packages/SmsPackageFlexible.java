package com.trendyol.notificationhub.packages;

public class SmsPackageFlexible extends Package{

    public SmsPackageFlexible() {
        this.baseCost = 30;
        this.overCost = 0.10;
        this.upperBound = 2000;
    }

    @Override
    public double calculateBill() {

        if(numberOfPackageUsage > upperBound){
            return baseCost + (overCost * (numberOfPackageUsage - upperBound));
        }
        return baseCost;
    }
}
