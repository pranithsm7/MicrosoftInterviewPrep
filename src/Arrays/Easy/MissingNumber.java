package Arrays.Easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int[] numWatch=new int[nums.length+1];

        for(int i=0;i<nums.length;i++){
            numWatch[nums[i]]++;
        }

        for(int i=0;i<numWatch.length;i++){
            if(numWatch[i]==0){
                return i;
            }
        }
        return 0;
    }
}
