package Arrays.Medium;

public class ProductWithoutSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product=1;

        for(int i=0;i<nums.length;i++){
            product*=nums[i];
        }

        for(int i=0;i<nums.length;i++){
            result[i]=product/nums[i];
        }

        return result;
    }
}
