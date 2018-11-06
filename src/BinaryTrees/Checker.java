package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Checker {

    public static void main(String[] args){

        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Collections.reverse(list);
        System.out.println(list);
    }
}
