package com.java.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the root Component, which can have 0 to n Leafs or Composites
 * This defines contracts which all other leafs/composites must follow
 * This is the root MenuComponent, which contains one/many MenuItems and one/many SubMenus
 * Each SubMenu can have one/many SubMenuItems and one/may SubMenus
 * Thus hierarchies will build with many MenuItems and SubMenus
 */
public abstract class MenuComponent {
    //Each MenuComponent's name field
    protected String name;
    //Each MenuComponent's name field
    protected String url;
    //Each MenuComponent's list of SubMenus if exist
    protected List<MenuComponent> subMenu = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    /**
     * By default adding a new MenuComponent to an existing MenuComponent is not allowed
     * This feature can be override in Sub Components
     */
    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level!");
    }

    /**
     * By default adding a new MenuComponent to an existing MenuComponent is not allowed
     * This feature can be override in Sub Components
     */
    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level!");
    }

    /**
     * toString method which must be override by each sub components to provide more details about itself
     * @return String
     */
    public abstract String toString();

    /**
     * print method which returns each components name and url deatils
     * @param menuComponent
     * @return String
     */
    protected String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }

}
