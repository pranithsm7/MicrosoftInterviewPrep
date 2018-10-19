package Arrays.AskedInAmazon;


import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, return another string after removing all
 * duplicates except the last one. Example : abcadba should return cdba
 * **/

public class RemoveDuplicatesExceptLast {

    public String returnExceptLast(String string){

        HashMap<Character, Integer> startIndex=new HashMap<>();
        HashMap<Character, Integer> endIndex=new HashMap<>();
        HashMap<Character, Integer> counter=new HashMap<>();


       for(int i=0;i<string.length();i++){

           if(startIndex.containsKey(string.charAt(i))){
               endIndex.put(string.charAt(i),i);
               counter.put(string.charAt(i),counter.get(string.charAt(i))+1);

           }else{
               startIndex.put(string.charAt(i),i);
               counter.put(string.charAt(i),1);
           }
      }

      StringBuffer sb=new StringBuffer();

      for(Map.Entry<Character, Integer> entry : counter.entrySet()){

           if(entry.getValue()>1){
               sb.append(string.charAt(endIndex.get(entry.getKey())));
           }else{
               sb.append(string.charAt(startIndex.get(entry.getKey())));
           }
      }
      return sb.toString();
    }


    public static void main(String[] args){

        String string="abcadba";

        System.out.println(new RemoveDuplicatesExceptLast().returnExceptLast(string));
    }
}
