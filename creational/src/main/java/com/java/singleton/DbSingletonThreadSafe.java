package com.java.singleton;

public class DbSingletonThreadSafe {

    //private static Volatile inatce variable, whose value will be null initially
    //volatile makes the instance remain singleton, through any of the changes inside JVM
    private static volatile DbSingletonThreadSafe dbSingletonThreadSafe = null;

    //private constructor, which will raise an exception if we try to create an instance through Java Reflection
    private DbSingletonThreadSafe() {
        if(dbSingletonThreadSafe != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    //public threadsafe setter which creates the objects lazily through double check locking mechanism
    public static DbSingletonThreadSafe getInstance() {
        if(dbSingletonThreadSafe == null) {
            synchronized (DbSingletonThreadSafe.class) {
                if(dbSingletonThreadSafe == null) {
                    dbSingletonThreadSafe = new DbSingletonThreadSafe();
                }
            }
        }
        return dbSingletonThreadSafe;
    }
}
