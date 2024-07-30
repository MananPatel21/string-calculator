package com.example;

public class StringCalculator{
    public static void main(String[] args){
        // StringCalculator calculator = new StringCalculator();
        // calculator.add("//;\n18;45;-99;-100");
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
        // For storing -ve numbers
        StringBuilder negativeNumbers = new StringBuilder();

        for(String part : parts){
            // Checking if number is -ve
            int num = Integer.parseInt(part);
            if(num < 0){
                if(negativeNumbers.length() > 0){
                    negativeNumbers.append(", ");
                }
                negativeNumbers.append(num);
            }
            sum += Integer.parseInt(part);
        }

        // Throwing exception if -ve number(s) is/are present
        if(negativeNumbers.length() > 0){
            throw new IllegalArgumentException("Negative number(s) is/are not allowed : " + negativeNumbers + "!! Try again :)");
        }

        return sum;

    }
}