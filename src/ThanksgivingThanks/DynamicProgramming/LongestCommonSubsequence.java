package ThanksgivingThanks.DynamicProgramming;

public class LongestCommonSubsequence {


    public static void main(String[] args){
        String a="abcdgh";
        String b="aedfhr";

        System.out.println(new LongestCommonSubsequence().longestCommonSubsequence(a,b));
    }

    public int longestCommonSubsequence(String a, String b){

        int lengtha=a.length();
        int lengthb=b.length();

        int[][] array=new int[lengtha+1][lengthb+1];

        for(int i=0;i<=lengtha;i++){
            for(int j=0;j<=lengthb;j++){

                if(i==0 || j==0){
                    array[i][j]=0;
                }else if(a.charAt(i-1)==b.charAt(j-1)){
                    array[i][j]=1+array[i-1][j-1];
                }else{
                    array[i][j]=Math.max(array[i-1][j],array[i][j-1]);
                }

            }
        }

        return array[lengtha][lengthb];
    }
}
