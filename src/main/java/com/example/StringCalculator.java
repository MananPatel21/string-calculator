package com.example;

public class StringCalculator{
    public static void main(String[] args){
        
    }

    public int add(String numbers){

        // Check and return 0 if string is empty
        if(numbers.isEmpty()){
            return 0;
        }

        // Splitting numbers that are separated by ','
        String[] parts = numbers.split(",");
        int sum = 0;

        for(String part : parts){
            sum += Integer.parseInt(part);
        }

        return sum;

    }
}