package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {

    public int findMinimumDistance(List<List<Integer>> list){

        int[] array=new int[list.size()];

        int size=list.size()-1;

        for(int i=0;i<list.get(size).size();i++){
            array[i]=list.get(size).get(i);
        }

        for(int i=size-1;i>=0;i--){
            for(int j=0;j<list.get(i).size();j++){
                array[j]=list.get(i).get(j)+Math.min(array[j],array[j+1]);
            }
        }

        return array[0];
        //System.out.print(Arrays.toString(array));
    }

    public static void main(String[] args){

        List<Integer> lista=new ArrayList<>();
        List<Integer> listb=new ArrayList<>();
        List<Integer> listc=new ArrayList<>();
        List<Integer> listd=new ArrayList<>();

        lista.add(2);
        listb.add(3);
        listb.add(4);
        listc.add(6);
        listc.add(5);
        listc.add(7);
        listd.add(4);
        listd.add(1);
        listd.add(8);
        listd.add(3);

        List<List<Integer>> list=new ArrayList<>();
        list.add(lista);
        list.add(listb);
        list.add(listc);
        list.add(listd);

        System.out.println(new Triangle().findMinimumDistance(list));
    }
}
