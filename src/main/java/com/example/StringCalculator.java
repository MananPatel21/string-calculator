package com.example;

import java.util.Arrays;
import java.util.List;

public class StringCalculator{
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        List<String> testInputs = Arrays.asList(
            "",
            "21",
            "18,45",
            "18,45,33",
            "18\n45,33",
            "//;\n18;45",
            "//;\n18,45",
            "18,abc,45",
            "//;\n18;45;-99;-100"
        );

        System.out.println("String Calculator - Processing list of inputs:");
        System.out.println("----------------------------------------------------------------");

        for(String input : testInputs){
            try{
                int result = calculator.add(input);
                System.out.println("Input: \"" + input + "\" | Output: " + result);
            }catch (IllegalArgumentException e){
                System.out.println("Input: \"" + input + "\" | " + e.getMessage());
            }
            System.out.println("----------------------------------------------------------------");
        }
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
            // Check if non-numeric
            if(!isNumeric(part)){
                throw new IllegalArgumentException("Invalid input: non-numeric value encountered - \"" + part + "\".");
            }
            int num = Integer.parseInt(part);
            // Checking if number is -ve
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

    // Check if numeric or not
    private boolean isNumeric(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }

}