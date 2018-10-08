package Arrays.Easy;

import java.util.Arrays;

public class ThreeSumClosest {

    public int threesumClosest(int[] nums, int target){
        int result=0;
        int value=Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){

            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(target-sum);

                if(diff==0){
                    return sum;
                }

                if(diff<value){
                    value=diff;
                    result=sum;
                }

                if(sum<=target){
                    j++;
                }else{
                    k--;
                }

            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(new ThreeSumClosest().threesumClosest(new int[]{2,3,4,5,6},8));
    }
}
