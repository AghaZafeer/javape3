package com.stackroute.pe3;

public class ConsecutiveNumbers {
    public static String checkSeriesOf7(String s)
    {
        String[] numbers=s.split(" ");
        for(int i=1;i<numbers.length;i++)
        {
            if(Integer.parseInt(numbers[i])-Integer.parseInt(numbers[i-1])!=1)
            {
                return "is not consecutive";
            }

        }return  "is consecutive";
    }


}
