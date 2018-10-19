package Arrays.DynamicProgramming;


//find the length of the subarray that needs to be sorted to make the whole array as sorted.


import java.util.Arrays;

public class Subsets {


    public int findUnsortedSubarray(int[] nums) {

        int[] sortedArray=nums.clone();
        Arrays.sort(sortedArray);

        int beginIndex=0;
        int endIndex=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]!=sortedArray[i]){
                beginIndex=i;
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]!=sortedArray[i]){
                endIndex=i;
                break;
            }
        }

        return (endIndex-beginIndex==0)?0:(endIndex-beginIndex+1);
    }
}
