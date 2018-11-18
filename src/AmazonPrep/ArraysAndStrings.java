package AmazonPrep;

public class ArraysAndStrings {

    public int firstUniqueChar(String s){

        if(s.length()==0 || s==null){
            return -1;
        }

        int[] array=new int[26];

        for(char c : s.toCharArray()){
            array[c-'a']++;
        }

        int index=0;

        for(int i=0;i<s.length();i++){
            if(array[s.charAt(i)-'a']==1){
                index=i;
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        System.out.println(new ArraysAndStrings().firstUniqueChar("loveleetcode"));
    }
}
