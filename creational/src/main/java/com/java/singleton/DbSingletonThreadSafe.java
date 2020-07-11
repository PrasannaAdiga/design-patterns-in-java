package com.java.singleton;

public class DbSingletonThreadSafe {

    //private static Volatile instance variable, whose value will be null initially
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

/**
 * Question: Why do we need double check locking mechanism?
 * Answer: Lets say two threads at the same time passed the first null check and one of the thread will
 *     gets the lock and other thread will be in wait state for the same class level lock.
 *     The thread which gets the lock, check for the null and go ahead to create the object and then release the lock
 *     Now the another thread gets the released lock, and before go ahead and create the object directly we need another null check.
 *     Since by this time object is created by the first thread, second thread will not create the instance again.
 **/