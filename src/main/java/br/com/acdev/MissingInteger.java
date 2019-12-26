package br.com.acdev;

public class MissingInteger {


    public int solution(int[] A){
        int[] occourrences = new int[1000000];
        int max = -1000000;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>0){
                occourrences[A[i]-1] = 1;
            }
            max = Math.max(max, A[i]);
        }
        for (int i = 0; i < occourrences.length; i++) {
            if(occourrences[i] == 0){
                return i+1;
            }
        }
        return Math.max(max+1,1);
    }
}
