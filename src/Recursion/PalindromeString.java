package Recursion;

public class PalindromeString {


    public boolean isPalindrome(String string){

        if(string.length()<2){
            return true;
        }else{
            char first= string.charAt(0);
            char last=string.charAt(string.length()-1);

            if(first==last){
                String remainder= string.substring(1, string.length()-1);
                return isPalindrome(remainder);
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(new PalindromeString().isPalindrome("naman"));
    }


}
