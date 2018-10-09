package Arrays.Easy;

import java.util.ArrayList;

public class PascalTriangle {

    public ArrayList<ArrayList<Integer>> pascalTriangle(int numRows){

        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        ArrayList<Integer> initial=new ArrayList<>();

        initial.add(1);

        result.add(initial);

        for(int i=1;i<numRows;i++){

            ArrayList<Integer> current=new ArrayList<>();

            current.add(1);

            for(int j=0;j<initial.size()-1;j++){
                int sum=initial.get(j)+initial.get(j+1);
                current.add(sum);
            }

            current.add(1);

            result.add(current);

            initial=current;
        }

    return result;

    }

    public static void main(String[] args){
        System.out.println(new PascalTriangle().pascalTriangle(4));
    }
}
