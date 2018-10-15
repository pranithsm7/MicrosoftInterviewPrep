package Revise;

import java.util.Arrays;

public class AddToArray {

    public int[] addToAnArray(int[] array){

        int carry=1;

        for(int i=array.length-1;i>=0;i--){

            int sum=carry+array[i];

            if(sum>=10){
                array[i]=sum%10;
                carry=1;
            }else{
                carry=0;
                array[i]=sum;
            }
        }

        if(carry==1){
            int[] result=new int[array.length+1];
            System.arraycopy(array,0,result,1,array.length);
            result[0]=1;
            return result;
        }

        return array;
    }

    public static void main(String[] args){
        int[] array={9,9};
        System.out.println(Arrays.toString(new AddToArray().addToAnArray(array)));
    }
}
