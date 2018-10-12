package Arrays.Hard;

public class FirstPositiveNumber {


    public int findTheFirstPositiveNumber(int[] array){

        int[] result=new int[array.length+1];

        for(int i=0;i<array.length;i++){

            if(array[i]<0){
                continue;
            }

            if(array[i]<=result.length){
                result[array[i]]=1;
            }
        }

        for(int i=1;i<result.length;i++){
            if(result[i]==0){
                return i;
            }
        }

        return result.length;
    }

    public static void main(String[] args){
        System.out.println(new FirstPositiveNumber().findTheFirstPositiveNumber(new int[]{7,8,9,11,12}));
    }
}
