package Arrays.Easy;

import java.util.Arrays;

public class SortByParityII {
    public int[] sortArrayByParityII(int[] A) {

        int[] resultArray=new int[A.length];
        int t=0;

        for(int i=0;i<A.length;i++){

            if(A[i]%2==0){
                resultArray[t]=A[i];
                t+=2;
            }

        }
        t=1;
        for(int i=0;i<A.length;i++){

            if(A[i]%2==1){
                resultArray[t]=A[i];
                t+=2;
            }

        }
        return resultArray;
    }

    public static void main(String[] args){
        int[] array={4,2,5,7};

        System.out.println(Arrays.toString(new SortByParityII().sortArrayByParityII(array)));
    }
}
