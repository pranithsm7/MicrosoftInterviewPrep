package Arrays.Easy;

import java.util.Arrays;


public class ArrayPartition {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum=sum+Math.min(nums[i],nums[i+1]);
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(new ArrayPartition().arrayPairSum(new int[]{1,4,3,5}));
    }
}
