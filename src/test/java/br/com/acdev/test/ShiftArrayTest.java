package br.com.acdev.test;

import br.com.acdev.ShiftArray;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.Assert.*;

public class ShiftArrayTest {

    @Test
    public void basicTest() {
        ShiftArray shiftArray = new ShiftArray();
        int[] A = new int[]{3, 8, 9, 7, 6};
        int[] R = new int[]{9, 7, 6, 3, 8};
        Assert.assertArrayEquals(R, shiftArray.shiftArray(A, 3));
    }


}