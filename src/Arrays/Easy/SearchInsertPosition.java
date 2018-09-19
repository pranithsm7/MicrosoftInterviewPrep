package Arrays.Easy;

/**
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You may assume no duplicates in the array.
 **/

public class SearchInsertPosition {

    public int indexFinder(int[] array, int target){
        int firstIndex=0;
        int lastIndex=array.length;

        if(target>array[array.length-1]){
            target=array[array.length-1];
        }

        while(firstIndex<lastIndex){

            int middlePosition=(firstIndex+lastIndex)/2;

            if(target<array[middlePosition]){
                lastIndex=middlePosition-1;
            }else{
                firstIndex=middlePosition+1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args){
        int[] array={1,2,3,4,5,6};
        int target=5;

        System.out.println(new SearchInsertPosition().indexFinder(array,7));
    }

}
