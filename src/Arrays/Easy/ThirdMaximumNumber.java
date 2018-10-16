package Arrays.Easy;

import java.util.TreeSet;

public class ThirdMaximumNumber {


    public int thirdMax(int[] nums) {

        TreeSet<Integer> set=new TreeSet<>();

        int number=0;

        for(int i=0;i<nums.length;i++){

            set.add(nums[i]);

            if(set.size()>3){
                set.pollFirst();
            }
        }

        if(set.size()<3){
            return set.last();
        }
        number=set.first();

    return number;
    }

    public static void main(String[] args){

        int[] array={1,2};
        System.out.println(new ThirdMaximumNumber().thirdMax(array));
    }
}
