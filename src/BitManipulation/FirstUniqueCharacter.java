package BitManipulation;

public class FirstUniqueCharacter {


    public static void main(String[] args){

        System.out.println(new FirstUniqueCharacter().findComplement(8));

    }

    public int findComplement(int x)
    {
        int length = Integer.toBinaryString(x).length();
        for(int i=0; i<length; i++)
        {
            if((x & (1 << i)) == 0)
            {
                x |= (1 << i);
                System.out.println("value of x for "+ i +" of i's value in if condition is: "+x);
            }
            else
            {
                x &= ~(1 << i);
                System.out.println("value of x for "+ i +" of i's value is: "+x);
            }
        }
        return x;
    }



}
