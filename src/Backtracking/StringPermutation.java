package Backtracking;
import java.lang.String;
import java.util.Arrays;
import java.util.Objects;

public class StringPermutation{
    public  void perm1(String s) { perm1("", s); }

    private void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++) {
                char chosen = s.charAt(i);

                perm1(prefix + chosen, s.substring(0, i) + s.substring(i + 1, n));
            }
        }

    }

    public static void main(String[] args){
        new StringPermutation().perm1("abcd");

        int[] array=new int[10];
        System.out.println(Arrays.toString(array));
        System.out.println(Objects.toString(array));
    }


}
