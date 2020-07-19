package com.java;

import com.java.composite.Menu;
import com.java.composite.MenuItem;

public class CompositeDemo {
    public static void main(String[] args) {
        //Create a root 'Main' Menu dropdown
        Menu mainMenu = new Menu("Main", "/main");
        //Create a single MenuItem 'Safety'
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");

        //Create a sub Menu 'Claims'
        Menu claimsSubMenu = new Menu("Claims", "/claims");
        //Create a sub MenuItem 'Personal Claims'
        MenuItem personalClaimMenuItem = new MenuItem("Personal Claims", "/personalClaims");
        //Add 'Personal Claims' sub MenuItem to sub menu 'Claims'
        claimsSubMenu.add(personalClaimMenuItem);

        //Add MenuItem 'Safety' directly to root Menu 'Main'
        mainMenu.add(safetyMenuItem);
        //Add the sub menu 'Claims' directly to root Menu 'Main'
        mainMenu.add(claimsSubMenu);

        /**
         * Final DropDown Menu hierarchy:
         *      - Main: /main (Parent Menu)
         *          - Safety: /safety (Menu Item)
         *          - Claims: /claims (Sub Menu)
         *              - Personal Claims: /personalClaims (Sub Menu Item)
         */
        System.out.println(mainMenu.toString());
    }
}
