package CollectionsFramework;

import java.util.TreeSet;

public class Sets {


    public static void main(String[] args){

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(7);


        int i=0;

       if(treeSet.size()>3){
           treeSet.pollFirst();
       }

       if(treeSet.size()<=2){
           System.out.println(treeSet.last());
       }

        System.out.println(treeSet.first());
    }
}
