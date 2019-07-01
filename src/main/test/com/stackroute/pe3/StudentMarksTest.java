package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
   @Test
    public void checkValidityShouldReturnTrue(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkValidity(0));
    }

    @org.junit.Test
    public void checkValidityShouldReturnTrue1(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkValidity(100));
    }
    @org.junit.Test
    public void checkValidityShouldReturnFalse(){
        StudentMarks sm=new StudentMarks();
        assertEquals(true,sm.checkValidity(66));
    }


}