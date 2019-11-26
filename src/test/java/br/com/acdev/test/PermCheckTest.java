package br.com.acdev.test;

import br.com.acdev.PermCheck;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckTest {

    @Test
    public void solution() {
        PermCheck permCheck = new PermCheck();
        Assert.assertEquals(0, permCheck.solution(new int[]{0,1,2}));
    }
}