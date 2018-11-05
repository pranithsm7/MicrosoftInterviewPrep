package Strings.Easy;

public class CompressString {

    public int lengthOfCompressedString(char[] chars){

        if(chars.length==1){
            return 1;
        }

        int counter=1;
        StringBuffer stringBuffer=new StringBuffer();

        for(int i=1;i<chars.length;i++){

            if(chars[i-1]==chars[i]){
                counter++;
            }else{
                stringBuffer.append(chars[i-1]);
                stringBuffer.append(counter);
                counter=1;
            }
        }

        if(chars[chars.length-1]==chars[chars.length-2]){
            stringBuffer.append(chars[chars.length-1]);
            stringBuffer.append(counter);
        }else{
            stringBuffer.append(chars[chars.length-1]);
        }

        System.out.println(stringBuffer);
        return stringBuffer.length();
    }

    public static void main(String[] args){
        char[] array={'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(new CompressString().lengthOfCompressedString(array));
    }
}
