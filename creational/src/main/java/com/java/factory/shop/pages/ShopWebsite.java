package com.java.factory.shop.pages;

import com.java.factory.Website;

//one of the concrete subclass of a Website
public class ShopWebsite extends Website {

    @Override
    protected void createWebsite() {
        //add bunch of pages which will creates a shopping website
        this.pages.add(new CartPage());
        this.pages.add(new ItemPage());
        this.pages.add(new SearchPage());
    }

}
