package com.cybertek.tests.review;

import com.cybertek.tests.day14_properties_driver_tests.Singleton;

public class SingletonR {


    public static void main(String[] args) {


        String instance1 = getInstance();
        System.out.println("instance1 = " + instance1);
        String instance2 = getInstance();
        SingletonR.close();
        String str2 = SingletonR.str;
        System.out.println(str2);

    }


    private SingletonR(){

    }

    private static String str;

    public static String getInstance(){

        if (str==null){
            System.out.println("str is null");
            str = "value";
        }else {
            System.out.println("str has value");
        }
        return str;
    }

    public static void close(){

        if (str!=null){
            str= null;
        }
    }



}
