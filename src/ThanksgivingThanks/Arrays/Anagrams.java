package ThanksgivingThanks.Arrays;

public class Anagrams {

    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        int[] array=new int[26];

        for(int i=0;i<s.length();i++){
            array[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            array[t.charAt(i)-'a']--;
        }

        for(int i=0;i<s.length();i++){
            if(array[s.charAt(i)-'a']!=0){
                return false;
            }
        }
        return true;
    }
}
