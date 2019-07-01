package com.stackroute.pe3;

public class DifferentExceptions {

    public static void main(String[] args) {
        try{
            int[] arr=new int[-2];
        }catch (NegativeArraySizeException e)
        {
            e.printStackTrace();
        }
        try{
            int[] arr=new int[2];
            arr[3]=7;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        try{
            String s=null;
            s.indexOf('a');
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }


}
