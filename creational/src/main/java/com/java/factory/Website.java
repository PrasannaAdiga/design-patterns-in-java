package com.java.factory;

import java.util.ArrayList;
import java.util.List;

//class contains common contract for a website
public abstract class Website {
    //list of pages in a concrete subclass
    public List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    //getter for pages
    public List<Page> getPages() {
        return pages;
    }

    //abstract method create a website which must be implemented by each subclasses
    protected abstract void createWebsite();

}
