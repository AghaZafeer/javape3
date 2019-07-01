package com.stackroute;

public class MainThrowingException {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try Block");
            throw new Exception();
        }
        catch(Exception e)
        {
            System.out.println("Inside catch block");
        }
        finally {
            System.out.println("In finally block");
        }
    }
}
