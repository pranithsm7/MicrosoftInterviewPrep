package Arrays.Easy;

import java.util.Arrays;

public class RotateArray {

    /**method 1 1**/
    public void rotate(int[] array, int position) {


        for(int i=0;i<position;i++){
            for(int j=array.length-1;j>0;j--){
                int temp=array[j];
                array[j]=array[j-1];
                array[j-1]=temp;
            }
        }
    }

    public void rotatetwo(int[] array, int position){

    }

    public static void main(String[] args){

        int[] array={1,2,3,4,5,6,7};
        int position=3;

        new RotateArray().rotate(array,position);

        System.out.println(Arrays.toString(array));

        }
    }

