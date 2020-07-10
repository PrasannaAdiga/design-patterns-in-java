package com.java.singleton;

public class DbSingletonEager {
    //private static instance which will create instance eagerly during class loading time
    private static DbSingletonEager dbSingletonEager = new DbSingletonEager();

    //private constructor, so instance can not be created from outside
    private DbSingletonEager() {
    }

    //public getter to get the same single instance always
    public static DbSingletonEager getInstance() {
        return dbSingletonEager;
    }
}
