package br.com.acdev.test;

import br.com.acdev.PermMissingElem;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest {

    @Test
    public void solution() {
        PermMissingElem permMissingElem = new PermMissingElem();
        Assert.assertEquals(4,permMissingElem.solution(new int[]{2, 3, 5, 1}));
        Assert.assertEquals(3,permMissingElem.solution(new int[]{1, 5, 2, 4}));
        Assert.assertEquals(2,permMissingElem.solution(new int[]{1, 5, 3, 4}));
        Assert.assertEquals(1,permMissingElem.solution(new int[]{2, 3, 4, 5}));
        Assert.assertEquals(1,permMissingElem.solution(new int[]{2}));
    }
}