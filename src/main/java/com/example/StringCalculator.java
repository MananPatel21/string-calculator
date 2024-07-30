package com.example;

public class StringCalculator{
    public static void main(String[] args){
        
    }

    public int add(String numbers){

        // Check and return 0 if string is empty
        if(numbers.isEmpty()){
            return 0;
        }

        // Defualt delimiters are ',' & '\n'
        String delimiter = ",|\n";

        // If new delimiter is used
        if(numbers.startsWith("//")){
            // Finding index of \n so that indirectly we get the index of new delimiter
            int nIdx = numbers.indexOf('\n');
            delimiter = numbers.substring(2, nIdx);
            // Removing that part from numbers string
            numbers = numbers.substring(nIdx + 1);
        }

        // Splitting numbers that are separated by ','
        String[] parts = numbers.split(delimiter);
        int sum = 0;

        for(String part : parts){
            sum += Integer.parseInt(part);
        }

        return sum;

    }
}