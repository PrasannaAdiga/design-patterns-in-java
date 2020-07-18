package com.java.factory;

import com.java.factory.blog.BlogWebsite;
import com.java.factory.enums.WebsiteType;
import com.java.factory.shop.pages.ShopWebsite;

//factory class which returns specific website depending on the asked type
public class WebsiteFactory {

    //static method which creates a specific website and returns it
    public static Website getWebsite(WebsiteType websiteType) {
        switch (websiteType) {
            case BLOG:
                return new BlogWebsite();
            case SHOP:
                return new ShopWebsite();
            default:
                return null;
        }
    }

}
