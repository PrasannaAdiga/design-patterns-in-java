package com.java.composite;

import java.util.Iterator;

/**
 * This is the Composite in 'Composite' pattern, which must link to one parent Component
 * Each Menu Component, which can have sub Menu Components
 * This Components will have knowledge on all of it's children components
 */
public class Menu extends MenuComponent {
    public Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * Overrides add method to allow adding any child components onto it
     */
    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        this.subMenu.add(menuComponent);
        return this;
    }

    /**
     * Overrides remove method to allow removing any child components from it
     */
    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        this.subMenu.remove(menuComponent);
        return this;
    }

    /**
     * Overrides toString method to provide complete details of it and all of it's children
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        Iterator<MenuComponent> subMenus = this.subMenu.iterator();
        while(subMenus.hasNext()) {
            builder.append(subMenus.next().toString());
        }
        return builder.toString();
    }
}
