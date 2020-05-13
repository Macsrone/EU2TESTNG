package com.cybertek.tests.day11_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {
    @Test
    public void test(){

        //getting project location/path dynamicly
        System.out.println(System.getProperty("user.dir"));


    }
}
