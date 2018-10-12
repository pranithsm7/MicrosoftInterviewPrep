package Arrays.Medium.ThreeSumProblems;

import java.util.*;

public class ThreeSum {


    public List<List<Integer>> threeSum(int[] array){

        Set<List<Integer>> hashSet=new HashSet<>();

        Arrays.sort(array);

        for(int i=0;i<array.length;i++){

            int j=i+1;
            int k=array.length-1;

            int sum=array[i]+array[j]+array[k];

            if(array[i]+array[j]+array[k]==0){
                List<Integer> list=new ArrayList<>();
                list.add(i);
                list.add(j);
                list.add(k);

                hashSet.add(list);
            }else if(sum<0){
                j++;
            }else{
                k--;
            }

        }

        return new ArrayList<>(hashSet);
    }

    public static void main(String[] args){
        System.out.println(new ThreeSum().threeSum(new int[]{-1,2,-1,3,4}));
    }
}
