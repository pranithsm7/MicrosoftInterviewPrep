package Arrays.Easy;

public class MonotonicArray {

        public boolean isMonotonic(int[] A) {
            return (isMonotonicIncrease(A) || isMonotonicDecrease(A));
        }

        public boolean isMonotonicIncrease(int[] A){

            for(int i=0;i<A.length-1;i++){
                if(A[i]>A[i+1]){
                    return false;
                }
            }
            return true;
        }

        public boolean isMonotonicDecrease(int[] A){

            for(int i=0;i<A.length-1;i++){
                if(A[i]<A[i+1]){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args){
            System.out.println(new MonotonicArray().isMonotonic(new int[]{6,5,4,3}));
        }
    }


