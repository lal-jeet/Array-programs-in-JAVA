package com.array_programs_15_05_2025;

import java.util.ArrayList;

public class AddElementInArray
{
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> numbers = new ArrayList<>(100);
                
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        
        int sum = 0;
        
        for (int number : numbers) 
        {
            sum += number;
        }        
        System.out.println("Sum of numbers: " + sum);
    }
}