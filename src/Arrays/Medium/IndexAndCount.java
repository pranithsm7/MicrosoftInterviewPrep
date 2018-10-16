package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexAndCount {


    public int[] indexAndCount(int[] array){

        int previous=0,current=0;
        int index=0;
        int maxValue=Integer.MIN_VALUE;
        int counter=0;
        //boolean isNoZeros=false,isNoOnes=false;


        for(int i=0;i<array.length;i++){

            if(array[i]==1){
                counter++;
            }else{
                index=i;
                previous=counter;
                counter=0;
            }

            maxValue=Math.max(previous+counter,maxValue);
        }
        return new int[]{index,maxValue};
    }

    public static void main(String[] args){

        System.out.println(Arrays.toString(new IndexAndCount().indexAndCount(new int[]{0,0,0,0,0,0,0})));
    }
}
