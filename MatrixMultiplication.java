import java.util.Scanner;

public class MatrixMultiplication{
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the no of rows of matrix 1:");
        r1 = sc.nextInt();
        System.out.println("enter the no of coloumn of matrix 1:");
        c1 = sc.nextInt();
        System.out.println("enter the no of rows of matrix 2:");
        r2 = sc.nextInt();
        System.out.println("enter the no of coloumn of matrix 2:");
        c2 = sc.nextInt();

        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];

        System.out.println("enter matrix 1 elements:\n");
        for (int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter matrix 2 elements:\n");
        for (int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                B[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix 1 is:\n");
        printMatrix(A,r1,c1);
        System.out.println("matrix 2 is:\n");
        printMatrix(B,r2,c2);
        System.out.println("resultant matrix is:\n");
        multiplyMatrix(r1,c1,A,r2,c2,B);


        
    }

    static void printMatrix(int M[][], int rowSize, int colSize){
        for (int i=0; i<rowSize; i++){
            for(int j=0; j< colSize; j++){
                System.out.println(M[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    };

    static void multiplyMatrix(int r1, int c1, int A[][], int r2, int c2, int B[][]){
        int C[][] = new int[r1][c2];

        if (c1!=r2){
            System.out.println("Matrix multiplication not possible\n");
            return;
        }

        for (int i=0; i<r1; i++){
            for (int j=0; j<c2; j++){
                for (int k=0; k<r2; k++){
                    C[i][j]+=A[i][k]+B[k][j];
                }
            }
        }

        printMatrix(C, r1, c2);
    }
}