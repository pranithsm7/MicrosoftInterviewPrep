package Arrays.Medium;

public class DebugRecursion {

    public int factorial(int number){

        if(number==0) return 1;

        return number*factorial(number-1);

    }

    public static void main(String[] args){
        System.out.println(new DebugRecursion().factorial(10));
    }
}
