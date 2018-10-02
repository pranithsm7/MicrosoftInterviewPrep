package Arrays.Easy;

public class FindPivotIndex {


    public static void main(String[] args){

        int rightValue=0;
        int leftValue=0;
        int[] array={1,2,3,4,3,3};

        for(int i=1;i<array.length;i++){
            rightValue+=array[i];
        }

        for(int i=1;i<array.length-1;i++){
            leftValue+=array[i-1];
            rightValue-=array[i];

            if(leftValue==rightValue){
                System.out.println(i);
            }
        }

    }
}
