package com.maicoding.learnspringaop.aopexample.business;

import com.maicoding.learnspringaop.aopexample.annotations.TrackTime;
import com.maicoding.learnspringaop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax() throws InterruptedException {
        Thread.sleep(30);
        int[] data = dataService1.retrieveData();

        //throw new RuntimeException("Something went wrong.");
        return Arrays.stream(data).max().orElse(0);
    }
}
