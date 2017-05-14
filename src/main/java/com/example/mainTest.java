package com.example;

import org.springframework.boot.SpringApplication;

/**
 * Created by Саша on 08.05.2017.
 */
public class mainTest {
    public static void main(String[] args) {
        int  attempts = 200;
        int result = 200;
        int steps = 0;

        for(int i=100; i>=1; i--) {
            result = 100/i + (i-1);
            if(attempts > result) {
                attempts = result;
                steps = i;
            }
        }

        System.out.print("attempts="+attempts+" "+"steps="+steps);
    }
}
