package br.com.acdev;

//Este código resolve o problema descrito neste URL
/*https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/*/
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
