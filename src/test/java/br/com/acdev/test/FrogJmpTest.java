package br.com.acdev.test;

import br.com.acdev.FrogJmp;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest {

    @Test
    public void solution() {
        FrogJmp frogJmp = new FrogJmp();
        Assert.assertEquals(1,frogJmp.solution(10,85,100));
    }
}