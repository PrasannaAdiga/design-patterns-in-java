package com.java;

import com.java.factory.Website;
import com.java.factory.WebsiteFactory;
import com.java.factory.WebsiteType;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(shop.getPages());
    }
}
