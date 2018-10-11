package Arrays.Medium;

public class GCDCalculator {

    private static int gcd(int a, int b) {
        while (b>0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }

    public static void main(String[] args){

        System.out.println(gcd(12,8));
    }
}
