package Arrays.Easy;

import java.util.Arrays;

public class MoveZeros {

    //2,0,1,0,4,5,0,9

    public void moveZerosToRight(int[] array){

        int initialPointer=0,movingPointer=0;
        int arrayLength=array.length;

        while(movingPointer<arrayLength){

            if(array[movingPointer]==0){
                movingPointer++;
            }else{
                array[initialPointer]=array[movingPointer];
                initialPointer++;
                movingPointer++;
            }
        }

        while(initialPointer<arrayLength){
            array[initialPointer]=0;
            initialPointer++;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args){

        new MoveZeros().moveZerosToRight(new int[]{2,0,1,0,4,5,0,9});
    }
}
