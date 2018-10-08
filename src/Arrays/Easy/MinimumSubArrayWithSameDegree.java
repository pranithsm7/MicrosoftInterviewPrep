package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class MinimumSubArrayWithSameDegree {


    public int minArrayWithSameDegree(int[] nums){

        Map<Integer, Integer> startIndex=new HashMap<>();
        Map<Integer, Integer> endIndex=new HashMap<>();
        Map<Integer, Integer> count=new HashMap<>();

        int maxCount=0;
        for(int i=0;i<nums.length;i++){

            if(!count.containsKey(nums[i])){
                startIndex.put(nums[i],i);
                count.put(nums[i],1);
            }else{
                endIndex.put(nums[i],i);
                count.put(nums[i],count.get(nums[i])+1);
                maxCount=Integer.max(count.get(nums[i]),maxCount);
            }
        }
        int minLength=Integer.MAX_VALUE;

        for(Integer value : count.keySet()){
            if(count.get(value)==maxCount){
                minLength=Math.min(minLength,endIndex.get(value)-startIndex.get(value)+1);
            }
        }

        return minLength;

    }

    public static void main(String[] args){

        System.out.println(new MinimumSubArrayWithSameDegree().minArrayWithSameDegree(new int[]{1,2,2,3,1,2}));
    }
}
