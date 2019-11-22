package br.com.acdev.test;

import br.com.acdev.OddOccourrences;
import org.junit.Assert;
import org.junit.Test;

public class OddOccourrencesTest {

    @Test
    public void baiscTest(){
        OddOccourrences oddOccourrences = new OddOccourrences();
        Assert.assertEquals(7, oddOccourrences.countUnpaired(new int[]{9, 3, 9, 3, 9, 7, 9}));
        Assert.assertEquals(5, oddOccourrences.countUnpaired(new int[]{5}));
        Assert.assertEquals(4, oddOccourrences.countUnpaired(new int[]{2, 2, 3, 3, 4}));
    }
}
