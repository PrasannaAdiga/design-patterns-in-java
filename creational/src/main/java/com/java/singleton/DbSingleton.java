package com.java.singleton;

public class DbSingleton {
    //private static instance which will create instance eagerly during class loading time
    private static DbSingleton dbSingleton = new DbSingleton();

    //private constructor, so instance can not be created from outside
    private DbSingleton() {
    }

    //public getter to get the same single instance always
    public static DbSingleton getInstance() {
        return dbSingleton;
    }
}
