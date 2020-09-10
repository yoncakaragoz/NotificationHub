package com.trendyol.notificationhub.packages;

public class EmailPackageFixed extends Package {


    public EmailPackageFixed() {
        this.baseCost = 10;
        this.overCost = 10;
        this.upperBound = 1000;
    }

    @Override
    public double calculateBill() {

        return baseCost + (int)(numberOfPackageUsage / upperBound) * overCost;
    }
}
