package AmazonPrep;

import java.util.Arrays;

public class ReverseStringTwo {

    public void reverseWords(char[] s) {
        int i=0;
        for(int j=0; j<s.length; j++){
            if(s[j]==' '){
                reverse(s, i, j-1);
                i=j+1;
            }
        }

        reverse(s, i, s.length-1);

        reverse(s, 0, s.length-1);

        System.out.println(Arrays.toString(s));
    }

    public void reverse(char[] s, int i, int j){
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){

        new ReverseStringTwo().reverseWords(new char[]{'t','h','e',' ','b','l','u','e'});
    }
}
