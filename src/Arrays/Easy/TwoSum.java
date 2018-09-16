package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }
        return new int[]{0,0};
    }

    public int[] returnTwoSum(int[] array, int sum){



            int j=0;
            int k=array.length-1;

            while(j<k){

            if(array[j]+array[k]==sum){
                return new int[]{j,k};
            }else if(array[j]+array[k]<sum){
                j++;
            }else{
                k--;
            }

        }
    return new int[]{0,0};
    }


    public static void main(String[] args){

        //int[] array=new TwoSum().twoSum(new int[]{1,2,3,4,5},90);

        //System.out.println(Arrays.toString(array));
        int[] array=(new TwoSum().returnTwoSum(new int[]{1,2,3,4,5},7));
        System.out.println(Arrays.toString(array));
    }

}
