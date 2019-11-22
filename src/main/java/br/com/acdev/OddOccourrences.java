package br.com.acdev;

import java.util.Arrays;
//Este código resolve o problema descrito neste URL
/*https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/*/
public class OddOccourrences {


    public int countUnpaired(int[] A){
        if(A.length==1){
            return A[0];
        }
        if(A.length==3){
            return A[0]==A[1] ? A[2] : A[0];
        }
        Arrays.sort(A);
        for(int i = 0; i < A.length-2;i = i + 2){
            if(A[i]!=A[i+1]){
                return A[i]==A[i+2] ? A[i+1] : A[i];
            }
        }
        return A[A.length-1];
    }
}
