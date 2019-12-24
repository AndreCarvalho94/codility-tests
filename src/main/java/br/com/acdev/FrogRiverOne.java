package br.com.acdev;

import java.util.Arrays;

public class FrogRiverOne {


    public int solution(int X, int[] A){
        int sum = X*(1+X)/2;
        int[] aux = new int[X];
        Arrays.fill(aux,0);
        for(int i = 0; i < A.length; i++){
            if(aux[A[i]-1] != 1){
                aux[A[i]-1] = 1;
                sum -= A[i];
                if(sum==0){
                    return i;
                }
            }
        }
        return -1;
    }
}
