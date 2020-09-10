package com.trendyol.notificationhub.packages;

public class SmsPackageFixed extends Package{

    public SmsPackageFixed() {
        this.baseCost = 20;
        this.overCost = 20;
        this.upperBound = 1000;
    }

    @Override
    public double calculateBill() {
        return baseCost + (int)(numberOfPackageUsage / upperBound) * overCost;
    }
}
