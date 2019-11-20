package br.com.acdev.test;

import br.com.acdev.BinaryGap;
import org.junit.Test;
import static org.junit.Assert.*;
public class BinaryGapTest {

    BinaryGap binaryGap = new BinaryGap();

    @Test
    public void basicTest(){
        assertEquals(2,binaryGap.maxZeros(328));
    }
}
