package Strings.Medium;

import java.util.Arrays;

public class CustomSorting {

    //cba
    //abcd

    /**
     * Let us use bucket sorting here.
     *
     * **/

    public String customSorting(String source, String destination){

        int[] sourceArray=new int[26];

        for(char c: destination.toCharArray()){
            sourceArray[c-'a']++;
        }

        StringBuffer sb=new StringBuffer();

        for(char t : source.toCharArray()){

            if(sourceArray[t-'a']>0){
                sb.append(t);
                sourceArray[t-'a']--;
            }
        }

        int i=0;


     for(char c='a';c<='z';c++){
            while(sourceArray[c-'a']>0){
                sb.append(c);
                sourceArray[c-'a']--;
            }
        }
    return sb.toString();
    }

    public static void main(String[] args){

        System.out.println(new CustomSorting().customSorting("cba","abcd"));
    }
}
