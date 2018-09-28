package Arrays.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

 One of the longest S[K]:
 S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
 * **/
public class ArrayNesting {

    public int arrayNesting(int[] array){
        HashSet<Integer> hashSet=new HashSet<>();
        int value=0;

        for(int i=0;i<array.length;i++){

            int counter=0;
            int number=array[i];

            while(!hashSet.contains(number)){
                hashSet.add(number);
                number=array[number];
                counter++;
            }

            if(value<counter){
                value=counter;
            }

        }
        return value;
    }

}
