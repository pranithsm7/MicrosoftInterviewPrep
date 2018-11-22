package ThanksgivingThanks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *[
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 *
 *
 */

public class Triangle {

    public void minimumTotal(ArrayList<ArrayList<Integer>> triangle){

        int[] array=new int[triangle.size()];

        for(int i=0;i<array.length;i++){
            array[i]=triangle.get(triangle.size()-1).get(i);
        }

        System.out.println(Arrays.toString(array));

        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
             array[j]=triangle.get(i).get(j)+Math.min(array[j],array[j+1]);
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();
        ArrayList<Integer> listc = new ArrayList<>();
        ArrayList<Integer> listd = new ArrayList<>();

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

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(lista);
        list.add(listb);
        list.add(listc);
        list.add(listd);

        new Triangle().minimumTotal(list);
    }

}
