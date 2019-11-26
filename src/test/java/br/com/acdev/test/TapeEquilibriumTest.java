package br.com.acdev.test;

import br.com.acdev.TapeEquilibrium;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTest {

    @Test
    public void solution() {
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        Assert.assertEquals(1,tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3}));
        Assert.assertEquals(2000,tapeEquilibrium.solution(new int[]{-2000,-4000}));
        Assert.assertEquals(2000,tapeEquilibrium.solution(new int[]{0,-2000}));
        Assert.assertEquals(2000,tapeEquilibrium.solution(new int[]{0,2000}));
        Assert.assertEquals(2000,tapeEquilibrium.solution(new int[]{1000,-1000}));
    }
}