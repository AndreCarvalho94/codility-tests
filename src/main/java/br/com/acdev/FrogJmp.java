package br.com.acdev;

public class FrogJmp {

    public int solution(int X, int Y, int D){
        return ((Y-X)/D) + ((Y-X)%D==0?0:1);
    }
}
