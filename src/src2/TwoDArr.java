package src2;

public class TwoDArr {
    public static void main(String[] args) {
        int[][] matrix=new int[10][10];
        int sum=0;

        //Initializing the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==j){
                    matrix[i][j]=i;
                }else{
                    matrix[i][j]=0;
                }
            }
        }

        //Printing the matrix elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        //Sum of diagonal elements
        System.out.println("");
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
        }
        System.out.println("The sum of diagonal elements of matrix is :- "+sum);
    }
}
