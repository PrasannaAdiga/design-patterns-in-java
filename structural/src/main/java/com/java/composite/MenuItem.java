package com.java.composite;

/**
 * This is the 'Leaf' in 'Composite' pattern, which must link to one parent or sub Component
 * Each MenuItem, must be link to either parent root compoent or any other child component
 * This Components will not have any child component, and hence no knowledge on any of the child components
 */
public class MenuItem extends MenuComponent {
    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    /**
     * overrides toString method to provide details about itself
     */
    @Override
    public String toString() {
        return print(this);
    }
}
