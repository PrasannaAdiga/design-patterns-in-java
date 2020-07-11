package com.java.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry for set of pre-registered online items
 *
 */
public class Registry {
    //In memory to hold pre items
    private Map<String, Item> items = new HashMap<>();

    //public constructor
    public Registry() {
        loadItems();
    }

    //get an item from registry, clone it and return the new cloned instance with shallow copy
    public Item getItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    //loads few pre-build items
    private void loadItems() {
        //create a mobile item
        Mobile mobile = new Mobile();
        mobile.setTitle("Mobile");
        mobile.setBrand("Apple");
        mobile.setPrice(500);
        System.out.println("Old mobile address " + mobile);

        //create a book item
        Book book = new Book();
        book.setAuthor("Prasanna");
        book.setPrice(300);
        book.setTitle("Design Patterns");
        System.out.println("Old book address " + book);

        //add mobile and book to registry
        items.put("Mobile", mobile);
        items.put("Book", book);
    }


}
