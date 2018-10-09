package Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

public class FancyCandy {

    public int[] fairCandySwap(int[] A, int[] B) {

        int SofA=0;
        int SofB=0;

        Set<Integer> setA=new HashSet<>();

        for(int i=0;i<A.length;i++){
            SofA+=A[i];
            setA.add(A[i]);

        }

        for(int i=0;i<B.length;i++){
            SofB+=B[i];
        }

        int remainder=(SofA-SofB)/2;

        for(int i=0;i<B.length;i++){
            int x=B[i]+remainder;

            if(setA.contains(x)){
                return new int[]{x,B[i]};
            }
        }
        return null;
    }
}
