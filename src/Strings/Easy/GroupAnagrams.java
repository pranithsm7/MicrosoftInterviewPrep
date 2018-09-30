package Strings.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagramString(String[] string){

        List<List<String>> result=new ArrayList<>();
        HashMap<String,ArrayList<String>> hashMap=new HashMap<>();

        for(String str : string){

            char[] array=new char[26];

            for(char c : str.toCharArray()){
                array[c-'a']++;
            }
            String newString=new String(array);

            if(hashMap.containsKey(newString)){

                hashMap.get(newString).add(str);
            }else{
                ArrayList<String> arrayList=new ArrayList<>();
                arrayList.add(str);
                hashMap.put(newString,arrayList);
            }
        }

        result.addAll(hashMap.values());

    return result;
    }

    public static void main(String[] args){

        String[] string={"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(new GroupAnagrams().groupAnagramString(string));
    }

}
