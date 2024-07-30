package com.example;

public class StringCalculator{
    public static void main(String[] args){
        
    }

    public int add(String numbers){

        // Check and return 0 if string is empty
        if(numbers.isEmpty()){
            return 0;
        }

        return Integer.parseInt(numbers);
    }
}