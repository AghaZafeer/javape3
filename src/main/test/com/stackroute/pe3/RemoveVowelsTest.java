package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void placesWithVowelsRemoved()
    {
        RemoveVowels r=new RemoveVowels();
        String result=r.places("India pakistan");
        assertEquals("nd pkstn",result);
    }
    @Test
    public void placesWithVowelsRemoved2()
    {
        RemoveVowels r=new RemoveVowels();
        String result=r.places("India pakistan canada");
        assertEquals("nd pkstn cnd",result);
    }

    @Test
    public void placesWithVowelsRemoved3()
    {
        RemoveVowels r=new RemoveVowels();
        String result=r.places("aeiou Aeiou");
        assertEquals(" ",result);
    }

}