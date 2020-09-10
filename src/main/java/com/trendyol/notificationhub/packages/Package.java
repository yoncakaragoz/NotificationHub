package com.trendyol.notificationhub.packages;

public abstract class Package {

    public int numberOfPackageUsage = 0;
    protected int upperBound;
    protected double overCost;
    protected double baseCost;

    public  abstract  double calculateBill() ;

    public  int sendMessage()  {

        return  ++numberOfPackageUsage;
    }

}


