package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums.length==1 || nums.length==0){
            return false;
        }
        int secondIndexValue=0;
        Map<Integer, Integer> hashMap=new HashMap<>();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){

            if(hashMap.containsKey(nums[i])){
                secondIndexValue=i;
                int value=secondIndexValue-hashMap.get(nums[i]);
                min=Math.min(min,value);
            }

            hashMap.put(nums[i],i);
        }

        if(min<=k){
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1,2,3,4,2},3));
    }
}
