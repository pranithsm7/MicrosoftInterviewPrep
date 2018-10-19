package Strings.Rough;

public class FindMaxValue {

    public int findLengthOfLCIS(int[] nums) {

        if(nums.length==0 || nums.length==1){
            return nums.length;
        }

        //[1,3,5,4,7]
        //^ ^ counter++; counter=0
        int counter=1;
        int maxValue=Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){

            if(nums[i]>nums[i-1]){
                counter++;
            }else{
                counter=0;
            }

            maxValue=Math.max(counter,maxValue);
        }
        return maxValue;
    }

    public static void main(String[] args){

        System.out.println(new FindMaxValue().findLengthOfLCIS(new int[]{1,3,5,7}));
    }
}
