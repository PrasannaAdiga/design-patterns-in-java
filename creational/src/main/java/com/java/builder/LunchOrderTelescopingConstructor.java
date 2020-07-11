package com.java.builder;

public class LunchOrderTelescopingConstructor {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    //public overloaded constructors
    //valid state check can be added in each constructor level
    public LunchOrderTelescopingConstructor(String bread) {
        this.bread = bread;
    }

    public LunchOrderTelescopingConstructor(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTelescopingConstructor(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTelescopingConstructor(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    //public getters, with no setters
    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

}
