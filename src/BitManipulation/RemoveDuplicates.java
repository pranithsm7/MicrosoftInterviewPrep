package BitManipulation;

public class RemoveDuplicates {

    public int singleNumber(int[] A) {
        int x = 0;
        for (int a : A) {
            x = x ^ a;
        }
        return x;
    }

    public static void main(String[] args){

        int[] array={1,1,2,2,3,3,6,5,5,4,4};
        System.out.println(new RemoveDuplicates().singleNumber(array));
    }
}
