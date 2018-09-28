package Arrays.Easy;

import java.util.Arrays;

public class RandomLogic1 {

    //{1,0,2,3,0,4}=>{1,2,3,4,0,0}


    public void moveZeros(int[] array){
        int initialPointer=0;
        int movingPointer=0;

        while(movingPointer<array.length){
            if(array[movingPointer]==0){
                movingPointer++;
            }else{
                array[initialPointer]=array[movingPointer];
                initialPointer++;
                movingPointer++;
            }
        }

        while (initialPointer<array.length){
            array[initialPointer]=0;
            initialPointer++;
        }

        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args){

        new RandomLogic1().moveZeros(new int[]{1,0,2,0,3,0,4});
    }
}
