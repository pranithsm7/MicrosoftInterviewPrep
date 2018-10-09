package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class NumberThatDisappeared {

    public List<Integer> numberthatdisappeared(int[] array){

        int[] result=new int[array.length+1];

        for(int i=0;i<array.length;i++){
            result[array[i]]++;
        }

        List<Integer> res=new ArrayList<>();

        for(int i=0;i<result.length;i++){
            if(result[i]==0){
                res.add(i);
            }
        }
     return res;
    }

    public static void main(String[] args){
        new NumberThatDisappeared().numberthatdisappeared(new int[]{4,3,2,7,8,2,3,1});
    }

}
