package com.java.builder;

public class LunchOrderJavaBean {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    //public no-arg constructor
    public LunchOrderJavaBean() {};

    //public setters and getters
    //valid state check can be added in each setter methods
    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

}
