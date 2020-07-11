package com.java;

import com.java.prototype.Book;
import com.java.prototype.Mobile;
import com.java.prototype.Registry;

/**
 * This pattern avoids creation of costly objects through constructor, instead uses copy/clone nature to create new instances
 * Typically does not uses'new' keyword. First instance will be created through 'new' keyword, and after that each instances will be created by cloning the existing objects
 * Implements Cloneable interfaces , which avoids of using 'new' keyword
 * Uses Interface definitions and base object of classes will be created, which implements this interface.
 * Registry will be used to store these base objects, and then new objects are created from these base objects through cloning
 * Objects can be cloned either through shallow or deep copy techniques
 * Objects created by shallow copy, will have the same references to cloned object's member variables
 * Objects created by deep copy, will have complete new member variables
 * Ex: java.lang.Object#clone()
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();

        //registry returns new instance, since old and new mobile's memory addresses are different
        Mobile newMobile = (Mobile) registry.getItem("Mobile");
        newMobile.setBrand("Samsung");
        System.out.println("new mobile address " + newMobile);

        //registry returns new instance, since old and new book's memory addresses are different
        Book newBook = (Book) registry.getItem("Book");
        newBook.setTitle("Advanced Java");
        System.out.println("new book address " + newBook);

        System.out.println(newMobile.getBrand() + " " + newMobile.getTitle());
        System.out.println("'" + newBook.getTitle() + "' - " + newBook.getAuthor());
    }
}
