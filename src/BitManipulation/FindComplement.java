package BitManipulation;

public class FindComplement {

        public int findComplement(int x)
        {
            int length = Integer.toBinaryString(x).length();
            for(int i=0; i<length; i++)
            {

                if((x & (1 << i)) == 0)
                {

                }
                else
                {
                    System.out.println(x &= ~(1 << i));
                }
            }
            return x;
        }

        public static void main(String[] args){

            System.out.println(new FindComplement().findComplement(11));
        }
}

