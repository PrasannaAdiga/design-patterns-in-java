package com.java.builder;

public class LunchOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    //private constructor, so object can not be created from outside
    private LunchOrder(LunchOrderBuilder lunchOrderBuilder) {
        this.bread = lunchOrderBuilder.bread;
        this.condiments = lunchOrderBuilder.condiments;
        this.dressing = lunchOrderBuilder.dressing;
        this.meat = lunchOrderBuilder.meat;
    }

    //public getters method, no setters
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

    //public static inner class, which is responsible to build the outer object with valid state when asked for
    //static is required to create the object through reference of the outer class
    public static class LunchOrderBuilder {
        //should have the same outer class fields
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        //no-arg public constructor
        //we can force the caller of the builder to provide, basic state for the object
        //ex: LunchOrderBuilder(String bread, String meat);
        public LunchOrderBuilder() {}

        //public list of builder methods
        public LunchOrderBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public LunchOrderBuilder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public LunchOrderBuilder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public LunchOrderBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }

        //final build method, responsible to create the outer object
        public LunchOrder build() {
            return new LunchOrder(this);
        }
    }

}
