package br.com.acdev;

import java.math.BigInteger;

public class PassingCars {

    public int solution(int[] A) {
        int cont = 0;
        BigInteger acc = BigInteger.ZERO;
        for(int i = A.length -1; i >= 0;i--){
            cont += A[i];
            if(A[i]==0){
                acc = acc.add(BigInteger.valueOf(cont));
            }
        }
        int val = acc.compareTo(BigInteger.valueOf(1000000000));
        return val <= 0? acc.intValue() : -1;
    }
}
