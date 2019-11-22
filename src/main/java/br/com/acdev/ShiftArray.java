package br.com.acdev;

public class ShiftArray {

    public int[] shiftArray(int[] A, int k){
        if(k==0)
            return A;
        int[] r = new int[A.length];
        for(int i = 0; i < A.length; i++){
            r[(i+k)%A.length] = A[i];
        }
        return r;
    }
}
