package br.com.acdev;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PermMissingElem {
    public int solution(int[] A){
        BigDecimal PA = BigDecimal.valueOf(A.length).
                        multiply(BigDecimal.valueOf(A.length+1)).
                        divide(BigDecimal.valueOf(2));
        BigDecimal sum = BigDecimal.ZERO;
        for (int i : A) {
            sum = sum.add(BigDecimal.valueOf(i));
        }
        return Integer.valueOf((BigInteger.valueOf(A.length+1)).subtract(sum.subtract(PA).toBigInteger()).toString());
    }
}
