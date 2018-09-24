package Arrays.Easy;

public class TransposeMatrix {

    public int[][] transpose(int[][] A) {

        int rowLength=A.length;
        int columnLength=A[0].length;

        int[][] transposeMatrix=new int[columnLength][rowLength];

        for(int i=0;i<columnLength;i++){
            for(int j=0;j<rowLength;j++){
                transposeMatrix[i][j]=A[j][i];
            }
        }
        return transposeMatrix;
    }
}
