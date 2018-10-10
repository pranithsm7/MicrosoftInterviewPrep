package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class TriangleBottomUp {

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        int[] total = new int[triangle.size()];
        int l = triangle.size() - 1;

        for (int i = 0; i < triangle.get(l).size(); i++) {
            total[i] = triangle.get(l).get(i);
        }

        // iterate from last second row
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
            }
        }

        return total[0];
    }

    public static void main(String[] args){

        ArrayList<Integer> lista=new ArrayList<>();
        ArrayList<Integer> listb=new ArrayList<>();
        ArrayList<Integer> listc=new ArrayList<>();
        ArrayList<Integer> listd=new ArrayList<>();

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

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        list.add(lista);
        list.add(listb);
        list.add(listc);
        list.add(listd);

        System.out.println(new TriangleBottomUp().minimumTotal(list));
    }
}
