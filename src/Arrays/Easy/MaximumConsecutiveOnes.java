package Arrays.Easy;

public class MaximumConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int minCount = 0;
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                counter++;
                minCount=Math.max(counter,minCount);

            } else {
                counter=0;
            }
        }
        return minCount;
    }

    public static void main(String[] args) {
        int[] nums={1,0,1,1,1,0,1};
        System.out.println(new MaximumConsecutiveOnes().findMaxConsecutiveOnes(nums));
    }
}
