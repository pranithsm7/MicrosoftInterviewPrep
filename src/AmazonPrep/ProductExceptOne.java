package AmazonPrep;

import java.util.Arrays;

public class ProductExceptOne {
    public int[] productExceptSelf(int[] nums) {

        int[] leftScan=new int[nums.length];
        int[] rightScan=new int[nums.length];

        leftScan[0]=rightScan[nums.length-1]=1;

        for(int i=1;i<leftScan.length;i++){
            leftScan[i]=leftScan[i-1]*nums[i-1];
        }

        for(int i=rightScan.length-2;i>=0;i--){
            rightScan[i]=rightScan[i+1]*nums[i+1];
        }

        int[] resultArray=new int[nums.length];

        for(int i=0;i<resultArray.length;i++){
            resultArray[i]=rightScan[i]*leftScan[i];
        }


     return resultArray;
    }

    public static void main(String[] args){

        int[] array=new int[]{0,2,3,4};

        System.out.println(Arrays.toString(new ProductExceptOne().productExceptSelf(array)));
    }
}
