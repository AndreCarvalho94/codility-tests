package br.com.acdev;

import java.util.stream.LongStream;

public class TapeEquilibrium {

    public int solution(int[] A){
        Long sum = Long.valueOf(0);
        Long[] acc = new Long[A.length];
        for(int i = 0; i < A.length; i++){
            sum += Long.valueOf(A[i]);
            acc[i] = sum;
        }
        Long min = Math.abs(acc[0] - (sum-acc[0]));//p=1
        for(int i = 1; i < A.length-1; i++){
            Long v = Math.abs(acc[i] - (sum-acc[i]));
            min = Math.min(v,min);
        }
        return min.intValue();
    }
}
