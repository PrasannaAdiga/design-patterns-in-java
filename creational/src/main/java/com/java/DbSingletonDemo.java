package com.java;

import com.java.singleton.DbSingletonEager;
import com.java.singleton.DbSingletonLazy;

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
    }
}
