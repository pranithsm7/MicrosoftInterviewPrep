package Arrays.BucketSort;

public class FirstPositiveNumber {

    public int findTheFirstPositiveNumber(int[] nums){

        int[] result=new int[nums.length+1];

        for(int i=0;i<nums.length;i++){

            if(nums[i]<0){
                continue;
            }

            if(nums[i]<=nums.length && result[nums[i]]==0){
                result[nums[i]]=1;
            }
        }

        for(int i=1;i<result.length;i++){
            if(result[i]==0){
                return i;
            }
        }

        return result.length+1;
    }

    public static void main(String[] args){

        System.out.println(new FirstPositiveNumber().findTheFirstPositiveNumber(new int[]{2}));
    }
}