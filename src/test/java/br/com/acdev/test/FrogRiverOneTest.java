package br.com.acdev.test;

import br.com.acdev.FrogRiverOne;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest {

    @Test
    public void solution(){
        FrogRiverOne fro = new FrogRiverOne();
        Assert.assertEquals(6, fro.solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }

}