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
        spiralMatrix(arr,row,col);

    }
    static void spiralMatrix(int[][] arr,int row,int col){
        int toprow=0;
        int rightCol=col-1;
        int bottomRow= row-1;
        int leftCol=0;
//Need to check
int count= 0;
        while(count< row * col){
            for(int i=leftCol;i<=rightCol;i++){
                System.out.print(" "+ arr[toprow][i]);
                count++;
            }
            toprow++;

            for(int i=toprow;i<=bottomRow;i++){
                System.out.print(" "+ arr[i][rightCol]);
                count++;
            }
            rightCol--;
            for(int i=rightCol;i>=leftCol;i--){
                System.out.print(" "+ arr[bottomRow][i]);
                count++;
            }
            bottomRow--;

               for(int i=bottomRow;i>=toprow;i--){
                System.out.print(" "+ arr[i][leftCol]);
                count++;
            }
            leftCol++;
        }
    }

}