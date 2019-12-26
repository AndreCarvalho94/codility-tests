package br.com.acdev.test;

import br.com.acdev.MaxCounters;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxCountersTest {

    @Test
    public void solution() {
        MaxCounters maxCounters = new MaxCounters();
        Assert.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}