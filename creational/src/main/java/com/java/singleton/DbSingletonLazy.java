package com.java.singleton;

public class DbSingletonLazy {
    //private static instance variable, whose value will be null initially
    private static DbSingletonLazy dbSingletonLazy = null;

    //private constructor, to restrict object creation from outside
    private DbSingletonLazy() {
    }

    //public getter which checks for the instance availability and creates if not available lazily
    public static DbSingletonLazy getInstance() {
        if(dbSingletonLazy == null) {
            dbSingletonLazy = new DbSingletonLazy();
        }
        return dbSingletonLazy;
    }

}
