package Strings.Easy;

public class FirstUniqueCharacter {




    public void printFirstUniqueCharacter(String string){

        int[] characterArray=new int[26];

        for(int i=0;i<string.length();i++){

            characterArray[string.charAt(i)-'a']++;
        }

        for(int i=0;i<string.length();i++){
            if(characterArray[string.charAt(i)-'a']==1){
                System.out.println(string.charAt(i));
                break;
            }
        }

    }

    public static void main(String[] args){

        new FirstUniqueCharacter().printFirstUniqueCharacter("pleetcpode");
    }
}
