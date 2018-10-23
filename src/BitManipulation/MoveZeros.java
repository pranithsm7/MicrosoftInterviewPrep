package BitManipulation;

import java.util.Arrays;

public class MoveZeros {

    //[1,2,0,3,0,4]-->[1,2,3,4,0,0]
    public void moveZeroes(int[] nums) {


        int i=0,j=0;

        while(j<nums.length){

            if(nums[j]==0){
                j++;
            }else{
                nums[i]=nums[j];
                i++;
                j++;

            }
        }

        while(i<nums.length){
            nums[i]=0;
            i++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){

        int[] array={1,2,0,3,0,4};
        new MoveZeros().moveZeroes(array);

    }
}
