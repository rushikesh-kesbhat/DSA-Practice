package Spiral_Matrix;

import java.util.Scanner;

class SprialMatrix_One_To_N{
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.err.println("Enter a No.");
         int n= sc.nextInt();
         int[][] arr= new int[n][n];
         int count=1;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=count;
                count++;
            }
         }
        //  printArray(arr);
         SpiralMatrixfromNToNSquare(n);
        //  sprialMatrix(arr,n);

    }
    static void printArray(int[][] arr){
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    static public void SpiralMatrixfromNToNSquare(int n){
        int num=1;
        int toprow=0;
        int rightCol=n-1;
        int bottomRow=n-1;
        int leftCol=0;
        int[][] arr = new int[n][n];

        while(num<=n*n){
            
            //print top Row
            for(int i=leftCol;i<=rightCol;i++){
                arr[toprow][i]=num++;
            }
            toprow++;

            //print Right Col
            for(int i=toprow;i<=bottomRow;i++){
                arr[i][rightCol]=num++;
            }
            rightCol--;

            //print botoom row
            for(int i=rightCol;i>=leftCol;i--){
                arr[bottomRow][i]=num++;
            }
            bottomRow--;

            //Print left column
            for(int i=bottomRow;i>=toprow;i--){
                arr[i][leftCol]=num++;
            }
            leftCol++;
        }
        printArray(arr);
    }
    static public void sprialMatrix(int[][] arr,int n){
        int toprow=0;
        int rightCol=n-1;
        int bottomRow=n-1;
        int leftCol=0;

        int count=0;
        
        while(count<n*n){
            //print Top Row
            for(int i=leftCol;i<=rightCol;i++){
                System.err.println(arr[toprow][i] + " ");
                count++;
            }
            toprow++;
            //print Right Row
            for(int i=toprow;i<=bottomRow;i++){
                System.err.println(arr[i][rightCol]+ " ");
                count++;
            }
            rightCol--;
            //print bottom Row
            for(int i=rightCol;i>=leftCol;i--){
                System.err.println(arr[bottomRow][i]+ " ");
                count++;
            }
            bottomRow--;
            //Print right col
            for(int i=bottomRow;i>=toprow;i--){
                System.out.println(arr[i][leftCol]+ " ");
                count++;
            }
            leftCol++;
        }

    }
}