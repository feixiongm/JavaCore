package com.imooc.sort;

public class Cup {
    private Gaizi gaizi;
    private BeiShen beiShen;
    private double volume;
    private double currentWater;

    public Cup() {
    }

    public Cup(Gaizi gaizi, BeiShen beiShen, double volume, double currentWater) {
        this.setGaizi(gaizi);
        this.setBeiShen(beiShen);
        this.setVolume(volume);
        this.setCurrentWater(currentWater);
    }

    public Gaizi getGaizi() {
        return gaizi;
    }

    public void setGaizi(Gaizi gaizi) {
        this.gaizi = gaizi;
    }

    public BeiShen getBeiShen() {
        return beiShen;
    }

    public void setBeiShen(BeiShen beiShen) {
        this.beiShen = beiShen;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCurrentWater() {
        return currentWater;
    }

    public void setCurrentWater(double currentWater) {
        if (currentWater <= 0) {
            System.out.println("杯子里没有水");
        } else {
            this.currentWater = currentWater;
        }
    }

    public void pullWater(double a) {
        System.out.println("杯子一共： " + this.getCurrentWater() + "升水");
        System.out.println("倒出了" + a + "升水");
        System.out.println("还剩下" + (this.getCurrentWater() - a) + "升水");
        //        System.out.println("倒出了" + this.);
        //        System.out.println("还剩下" + (this.getVolume() - this.getCurrentWater()));
    }

}
