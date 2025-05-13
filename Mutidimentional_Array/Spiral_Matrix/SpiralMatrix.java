package Mutidimentional_Array.Spiral_Matrix;

import java.util.Scanner;

class SpiralMatrix{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int row=sc.nextInt();
        System.out.println("Enter no. of columns");
        int col=sc.nextInt();
        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 arr[i][j]= sc.nextInt();
            }
        }

    }
    static void spiralMatrix(int[][] arr,int row,int col){
        int toprow=0;
        int rightCol=col-1;
        int bottomRow= row-1;
        int leftCol=0;
//Need to check
        while(){
            for(int i=toprow;i<rightCol;i++){
                System.out.print(" "+ arr[toprow][i]);
            }
            toprow++;

            for(int i=toprow;i<rightCol;i++){
                System.out.print(" "+ arr[i][rightCol]);
            }
            rightCol--;

            for(int i=rightCol;i>leftCol;i--){
                System.out.print(" "+ arr[bottomRow][i]);
            }
            bottomRow--;

               for(int i=rightCol;i>leftCol;i--){
                System.out.print(" "+ arr[bottomRow][i]);
            }
            bottomRow--;


        }
    }

}