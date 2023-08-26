package com.maicoding.learnspringaop.aopexample.data;

import com.maicoding.learnspringaop.aopexample.business.DataService1;

import java.util.Arrays;

public class BusinessService1 {

    private DataService1 dataService1;

    public int calculateMax(){
        int[] data = dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
