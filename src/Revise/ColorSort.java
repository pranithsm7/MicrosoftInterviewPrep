package Revise;

import java.util.Arrays;

public class ColorSort {


    public int[] colorSort(int[] array){


        int[] colorArray=new int[3];
        int[] result=new int[array.length];

        for(int i=0;i<array.length;i++){
            colorArray[array[i]]++;
        }

        int i=0,j=0;

        while(j<=2){

            if(colorArray[j]>0) {
                result[i] = j;
                colorArray[j] = colorArray[j] - 1;
                i++;
            }else{
                j++;
            }

        }
    return result;
    }

    public static void main(String[] args){

        int[] array={0,1,0,1,0,0,1,2,2,0,2};

        System.out.println(Arrays.toString(new ColorSort().colorSort(array)));
    }
}
