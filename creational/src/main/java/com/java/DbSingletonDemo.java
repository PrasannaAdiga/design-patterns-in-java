package com.java;

import com.java.singleton.DbSingletonEager;
import com.java.singleton.DbSingletonLazy;
import com.java.singleton.DbSingletonThreadSafe;

public class DbSingletonDemo {
    public static void main(String[] args) {
        //Check DbSingletonEager
        DbSingletonEager dbSingletonEager = DbSingletonEager.getInstance();
        System.out.println(dbSingletonEager);
        DbSingletonEager anotherDbSingletonEager = DbSingletonEager.getInstance();
        System.out.println(anotherDbSingletonEager);

        //Check DbSingletonEager
        DbSingletonLazy dbSingletonLazy = DbSingletonLazy.getInstance();
        System.out.println(dbSingletonLazy);
        DbSingletonLazy anotherDbSingletonLazy = DbSingletonLazy.getInstance();
        System.out.println(anotherDbSingletonLazy);

        //Check DbSingletonThreadSafeAndReflectionSafe
        DbSingletonThreadSafe dbSingletonThreadSafe = DbSingletonThreadSafe.getInstance();
        System.out.println(dbSingletonThreadSafe);
        DbSingletonThreadSafe anotherDbSingletonThreadSafe = DbSingletonThreadSafe.getInstance();
        System.out.println(anotherDbSingletonThreadSafe);
    }
}
