package Arrays.Medium;

import java.util.*;

public class FindAllDuplicates {

    //method1
    public List<Integer> findDuplicates(int[] array){

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<array.length;i++){

            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }else{
                hashMap.put(array[i],1);
            }
        }

        List<Integer> list=new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
       return list;
    }

    public static void main(String[] args){
        System.out.println(new FindAllDuplicates().findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
}
