package Arrays.Easy;

public class DominantIndex {


    public int dominantIndex(int[] array){

        int maxIndex=Integer.MIN_VALUE;
        int maxValue=0;

        for(int i=0;i<array.length;i++){

            if(array[i]>maxValue){
                maxValue=array[i];
                maxIndex=i;
            }
        }


        for(int i=0;i<array.length;i++){

            if(i!=maxIndex && 2*array[i]>maxValue){
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args){

        int[] array={1,2,3,8};
        System.out.println(new DominantIndex().dominantIndex(array));
    }
}
