package com.stackroute.pe3;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessboardPatternTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void chess8Cross8()
    {
        ChessboardPattern cp=new ChessboardPattern();
        cp.matrixInitialisation(8);
        String result=cp.setMatrices();
        assertEquals("BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n" +
                "BB WW BB WW BB WW BB WW \n",result);
    }
    @Test
    public void chess2Cross2()
    {
        ChessboardPattern cp=new ChessboardPattern();
        cp.matrixInitialisation(2);
        String result=cp.setMatrices();
        assertEquals("BB WW \n" +
                "BB WW \n",result);
    }
    @Test
    public void chess4Cross4()
    {
        ChessboardPattern cp=new ChessboardPattern();
        cp.matrixInitialisation(4);
        String result=cp.setMatrices();
        assertEquals("BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n" +
                "BB WW BB WW \n",result);
    }




}