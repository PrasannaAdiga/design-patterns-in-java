package com.java.prototype;

/**
 * Abstract class which provides common definitions for an online Item
 * Extends Cloneable interface which provides clone method from Java
 * **/
public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;

    //implement the clone method, which just creates the new instance by clone method of super class
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
