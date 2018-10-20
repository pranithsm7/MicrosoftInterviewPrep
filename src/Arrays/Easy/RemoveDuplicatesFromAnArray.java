package Arrays.Easy;

public class RemoveDuplicatesFromAnArray {

        public int removeDuplicates(int[] nums) {
            int i=0,j=0;

            while(j<nums.length){

                if(nums[i]==nums[j]){
                    j++;
                }else{
                    i++;
                    nums[i]=nums[j];
                    j++;

                }
            }
            return i+1;
        }

    public static void main(String[] args){
        int[] array={1,1,2};

        System.out.println(new RemoveDuplicatesFromAnArray().removeDuplicates(array));
    }
}
