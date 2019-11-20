package br.com.acdev;
//Este código resolve o problema descrito neste URL
/*https://app.codility.com/programmers/lessons/1-iterations/binary_gap/*/
public class BinaryGap {

    public int maxZeros(int n){
        if(verifyPowerOf2(n)){
            return 0;
        }
        char[] str = Integer.toBinaryString(n).replaceAll("0+$","").toCharArray();
        int cont  = 0;;
        int max = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] == '0'){
                cont += 1;
                max = Math.max(cont,max);
            }else{
                cont = 0;
            }
        }
        return max;
    }

    private boolean verifyPowerOf2(double v){
        double n = Math.log10(v)/Math.log10(2);
        return (n/(int)n) == 1;
    }
}
