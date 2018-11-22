package Arrays.Easy;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args){

        String string="a, a, a, a, b , b, b, c, c";

        System.out.println(new HashMapTest().mostCommonWord(string,new String[]{"a"}));
    }

    public String mostCommonWord(String paragraph, String[] banned) {

        if(paragraph.length()==0 || paragraph==null){
            return paragraph;
        }

        if(paragraph.replaceAll("[!?',;.]","").length()==1){
            return paragraph.replaceAll("[!?',;.]","");
        }

        paragraph=paragraph.toLowerCase().replaceAll("[!?',;.]","");
        String[] stringArray=paragraph.split(" ");
        HashMap<String,Integer> hashMap=new HashMap<>();
        int maxValue=Integer.MIN_VALUE;
        List<Integer> list=new ArrayList<>();
        String result="";
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        for(String s : stringArray){

            if(!bannedSet.contains(s)){
                if(hashMap.containsKey(s)){
                    hashMap.put(s,hashMap.get(s)+1);
                }else{
                    hashMap.put(s,1);
                }
            }
        }


        for(Map.Entry<String,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>maxValue){
                maxValue=entry.getValue();
                result=entry.getKey();
            }
        }
        return result;
    }
}
