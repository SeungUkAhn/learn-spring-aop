package com.maicoding.learnspringaop.aopexample.data;

import com.maicoding.learnspringaop.aopexample.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {

    @TrackTime
    public int[] retrieveData() throws InterruptedException {
        Thread.sleep(30);
        return new int[] {11, 22, 33, 44, 55};
    }
}
