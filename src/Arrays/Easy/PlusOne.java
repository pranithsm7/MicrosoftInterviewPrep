package Arrays.Easy;

public class PlusOne {

    public int[] addOneToArray(int[] array){


        int carry=1;
        for(int i=array.length-1;i>=0;i--){

            int sum=array[i]+carry;

            if(sum>=10){
                carry=1;
            }else{
                carry=0;
            }
        array[i]=sum%10;
        }

        return array;
    }


    public static void main(String[] args){
        int[] array={1,2,3};

    }
}
