package Strings.Hard;

public class IntegerToEnglish {
    private final String[] belowTen={"","one","two","three","four","five","six","seven","eight","nine"};

    private final String[] belowTwenty={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    private final String[] belowHundred={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    /**
     method to generate the word value of an integer. Takes in an integer value and generates a string.
     **/
    public String numberConverter(int num){

        if(num==0){
            return "zero";
        }

        return helper(num);
    }

    public String helper(int num){

        String result="";

        if(num<10){
            result=belowTen[num];
        }else if(num<100){
            result=belowHundred[num/10]+" "+helper(num%10);
        }else if(num<1000){
            result=helper(num/100)+" hundred "+helper(num%100);
        }else if(num<1000000){
            result=helper(num/1000)+" thousand "+helper(num%1000);
        }else if(num<1000000000){
            result=helper(num/1000000)+" million "+helper(num%1000000);
        }else{
            result=helper(num/1000000000)+" billion "+helper(num%1000000000);
        }

        return result;
    }

    public static void main(String[] args){

        System.out.println(new IntegerToEnglish().numberConverter(1234567891));
    }
}
