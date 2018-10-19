package Revise;

public class MaxSort {

    public int findPeakElement(int[] nums) {

        int maxValue=nums[0],index=0;

        for(int i=1;i<nums.length-1;i++){

            int current=nums[i];
            int previous=nums[i-1];
            int next=nums[i+1];


            if(current>previous && current>next){
                maxValue=current;
                index=i;
            }

        }

        if(nums[nums.length-1]>maxValue){
            return nums.length-1;
        }


        return index;
    }

    public static void main(String[] args){

        System.out.println(new MaxSort().findPeakElement(new int[]{2,1}));
    }
}
