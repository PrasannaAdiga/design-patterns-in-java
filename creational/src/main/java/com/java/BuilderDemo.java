package com.java;

import com.java.builder.LunchOrder;
import com.java.builder.LunchOrderJavaBean;
import com.java.builder.LunchOrderTelescopingConstructor;

/**
 * This pattern is used to handle complex constructor scenarios
 * Constructor will have many sets of parameters
 * Classes created by this pattern are usually immutable in nature, through applying no setters
 * This pattern requires a static inner classes, which is used to build the required object
 * No interfaces are required to define, can be achieved through static classes
 * Can be used easily with Legacy codes
 * Ex: StringBuilder, StringBuffer, DocumentBuilder
 */
public class BuilderDemo {
    public static void main(String[] args) {
        //Check LunchOrder Java Bean
        LunchOrderJavaBean lunchOrderJavaBean = new LunchOrderJavaBean();

        lunchOrderJavaBean.setBread("Wheat");
        lunchOrderJavaBean.setCondiments("sugar");
        lunchOrderJavaBean.setDressing("Mustard");
        lunchOrderJavaBean.setMeat("Hom");

        System.out.println("Ordered lunch details: " + lunchOrderJavaBean.getBread() + " " +
                lunchOrderJavaBean.getCondiments() + " " + lunchOrderJavaBean.getDressing() + " " +
                lunchOrderJavaBean.getMeat());
        /**
         * This approach of creating object has following drawbacks:
         *  Allows to create an object with invalid states
         *  Setter methods allows to mutate the created objects
         */

        /* ================================================================================== */

        //Check LunchOrder Telescoping Constructor.
        //Class having multiple overloaded constructor are called Telescoping Constructor
        LunchOrderTelescopingConstructor lunchOrderTelescopingConstructor =
                new LunchOrderTelescopingConstructor("Wheat", "Sugar", "Mustard", "Hom");
        System.out.println("Ordered lunch details: " + lunchOrderTelescopingConstructor.getBread() + " " +
                lunchOrderTelescopingConstructor.getCondiments() + " " + lunchOrderTelescopingConstructor.getDressing() + " " +
                lunchOrderTelescopingConstructor.getMeat());
        /**
         * Advantages of this approach: No Setters, so that objects are immutable once created
         * Disadvantages: Need to create multiple overloaded constructor, to create an object with expected valid state
         */

        /* ================================================================================== */

        //Check LunchOrder Builder Pattern
        //create an object of static inner class, through outer class reference
        LunchOrder.LunchOrderBuilder lunchOrderBuilder = new LunchOrder.LunchOrderBuilder();
        //use the builder class to build the LunchOrder, with required valid state
        LunchOrder lunchOrder = lunchOrderBuilder.bread("Wheat").condiments("Sugar").dressing("Mustard").meat("Hom").build();
        System.out.println("Ordered lunch details: " + lunchOrder.getBread() + " " +
                lunchOrder.getCondiments() + " " + lunchOrder.getDressing() + " " +
                lunchOrder.getMeat());
        /**
         * Advantages of this approach:
         * flexibility of java bean approach + contract nature of constructor approach
         * we can build each objects with it's own required state
         */
    }
}
