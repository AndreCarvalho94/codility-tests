package br.com.acdev;

import java.util.Arrays;

public class MaxCounters {

    //setar os valores nos contadores de acordo com o array de operaçoes passado
    public int[] solution(int N, int[]A){
        int max = 0;
        int lastMax = 0;
        int[] counters  = new int[N];
        Arrays.fill(counters,0);

        for (int i = 0; i < A.length; i++) {
            if(A[i] == N+1){
                lastMax = max;
            }else{
                counters[A[i]-1] = counters[A[i]-1] > lastMax?
                        counters[A[i]-1] + 1 : lastMax + 1;
                max = Math.max(max, counters[A[i]-1]);
            }
        }
        for (int i = 0; i < counters.length; i++) {
            counters[i] = Math.max(lastMax, counters[i]);
        }
        return counters;
    }

}
