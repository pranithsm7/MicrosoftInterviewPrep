package Arrays.Easy;

import java.util.Arrays;

public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int incrementor=0;
        int[] result=new int[A.length];

        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                result[incrementor++]=A[i];
            }
        }

        for(int i=0;i<A.length;i++){
            if(A[i]%2==1){
                result[incrementor++]=A[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(new int[]{3,1,2,4})));
    }
}
