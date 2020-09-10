package com.trendyol.notificationhub.packages;

public class EmailPackageFlexible extends Package {

    public EmailPackageFlexible() {
        this.baseCost = 7.5;
        this.overCost = 0.03;
        this.upperBound = 2000;
    }

    public double calculateBill() {

        if(numberOfPackageUsage > upperBound){
            return baseCost + (overCost * (numberOfPackageUsage - upperBound));
        }
        return baseCost;
    }


}
