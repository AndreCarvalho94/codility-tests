package br.com.acdev.test;

import br.com.acdev.MissingInteger;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    @Test
    public void solution() {
        MissingInteger mi = new MissingInteger();
        Assert.assertEquals(4, mi.solution(new int[]{1, 2, 3}));
    }
}