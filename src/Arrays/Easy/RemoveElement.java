package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveElement {

    public int removeElement(int[] A, int elem) {
        int i=0;
        int j=0;

        while(j < A.length){
            if(A[j] != elem){
                A[i] = A[j];
                i++;
            }

            j++;
        }

        return i;
    }

    public static void main(String[] args){

        HashMap<Integer, Integer> hashMap=new HashMap<>();
        hashMap.

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){

            entry.
        }

        System.out.println(new RemoveElement().removeElement(new int[]{0,1,2,2,3,0,4,2},2));
    }
}
