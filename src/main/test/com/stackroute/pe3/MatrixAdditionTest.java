package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMatrices() {
        MatrixAddition matrixAddition = new MatrixAddition();
        matrixAddition.MatrixInitialisation(3, 2);
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {9, 8, 7, 6, 5, 4};
        matrixAddition.setMatrices(a, b);
        Integer[][] sum = matrixAddition.addMatrices(matrixAddition.matrix1, matrixAddition.matrix2);
        Integer[][] c = {{10, 10,},{10, 10},{10,10}};
        assertEquals("10 10 10 10 10 10",sum[0][0]+" "+sum[0][1]+" "+sum[1][0]+" "+sum[1][1]+" "+sum[2][0]+" "+sum[2][1]);


    }
    @Test
    public void addMatrices1() {
        MatrixAddition matrixAddition = new MatrixAddition();
        matrixAddition.MatrixInitialisation(3, 2);
        int[] a = {1, 2, 2, 4, 5, 6};
        int[] b = {9, 8, 7, 6, 5, 4};
        matrixAddition.setMatrices(a, b);
        Integer[][] sum = matrixAddition.addMatrices(matrixAddition.matrix1, matrixAddition.matrix2);
        Integer[][] c = {{10, 10,},{10, 10},{10,10}};
        assertEquals("10 10 9 10 10 10",sum[0][0]+" "+sum[0][1]+" "+sum[1][0]+" "+sum[1][1]+" "+sum[2][0]+" "+sum[2][1]);


    }
    @Test
    public void addMatrices2() {
        MatrixAddition matrixAddition = new MatrixAddition();
        matrixAddition.MatrixInitialisation(3, 2);
        int[] a = {1, 2, 2, 2, 2, 6};
        int[] b = {9, 8, 7, 6, 5, 4};
        matrixAddition.setMatrices(a, b);
        Integer[][] sum = matrixAddition.addMatrices(matrixAddition.matrix1, matrixAddition.matrix2);
        Integer[][] c = {{10, 10,},{10, 10},{10,10}};
        assertEquals("10 10 9 8 7 10",sum[0][0]+" "+sum[0][1]+" "+sum[1][0]+" "+sum[1][1]+" "+sum[2][0]+" "+sum[2][1]);


    }

}