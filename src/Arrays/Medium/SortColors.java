package Arrays.Medium;

import java.util.Arrays;

public class SortColors {

    public void sortColorsInOccurrance(int[] array){

        int[] colors=new int[3];

        for(int i=0;i<array.length;i++){
            colors[array[i]]++;
        }

        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }

        int appender=0;
        int i=0;

        while(appender<=2){

            if(colors[appender]!=0){
                array[i++]=appender;
                colors[appender]=colors[appender]-1;
            }else{
                appender++;
            }
        }

        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args){

        int[] array={0,2,1,0,1,0,2};
        new SortColors().sortColorsInOccurrance(array);
    }
}
