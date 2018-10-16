package Revise;

import java.util.Arrays;

public class MoveZeros {


    public int[] returnMovedArray(int[] array){

        int i=0,j=0;

       while(j<array.length){

           if(array[j]!=0){
               array[i]=array[j];
               j++;
               i++;
           }else{
               j++;
           }
       }

       while(i<array.length){
           array[i]=0;
           i++;
       }

       return array;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(new MoveZeros().returnMovedArray(new int[]{1,2,0,3,0,4})));
    }

}
