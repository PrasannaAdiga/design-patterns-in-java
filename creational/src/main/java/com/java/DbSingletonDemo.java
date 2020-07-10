package com.java;

import com.java.singleton.DbSingleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        //Check DbSingleton
        DbSingleton dbSingleton = DbSingleton.getInstance();
        System.out.println(dbSingleton);
        DbSingleton anotherDbSingleton = DbSingleton.getInstance();
        System.out.println(anotherDbSingleton);
    }
}
