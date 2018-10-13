package Arrays.Easy;

import java.util.Arrays;

public class TwoSumTwo {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;

        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args){

        System.out.println(Arrays.toString(new TwoSumTwo().twoSum(new int[]{1,4,7,9},16)));
    }
}
