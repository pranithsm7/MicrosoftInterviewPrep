package Arrays.Easy;

public class FindPeakElement {

    public int findPeakElement(int[] array){

        int max=0;
        int maxValue=array[0];

        for(int i=1;i<=array.length-2;i++){
            int leftElement=array[i-1];
            int currentElement=array[i];
            int rightElement=array[i+1];

            if(currentElement>leftElement && currentElement>rightElement && currentElement>max){
                max=i;
                maxValue=currentElement;
            }
        }

        if(array[array.length-1]>maxValue){
            max=array.length-1;
        }
    return max;
    }

    public static void main(String[] args){

        System.out.println(new FindPeakElement().findPeakElement(new int[]{1,2,3,1}));
    }
}
