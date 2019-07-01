package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstLastOfWeekTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void FirstAndLastDayOfTheWeek()
    {
        FirstLastOfWeek day=new FirstLastOfWeek();
        day.setCal(2019,6,4);
        String result1=day.getFirstDay();
        String result2=day.getLastDay();
        assertEquals("Monday 1 6 2019",result1);
        assertEquals("Sunday 7 6 2019",result2);
    }
    @Test
    public void FirstAndLastDayOfTheWeek1()
    {
        FirstLastOfWeek day=new FirstLastOfWeek();
        day.setCal(2019,5,29);
        String result1=day.getFirstDay();
        String result2=day.getLastDay();
        assertEquals("Monday 24 5 2019",result1);
        assertEquals("Sunday 30 5 2019",result2);
    }
    @Test
    public void FirstAndLastDayOfTheWeek2()
    {
        FirstLastOfWeek day=new FirstLastOfWeek();
        day.setCal(2019,10,19);
        String result1=day.getFirstDay();
        String result2=day.getLastDay();
        assertEquals("Monday 18 10 2019",result1);
        assertEquals("Sunday 24 10 2019",result2);
    }


}