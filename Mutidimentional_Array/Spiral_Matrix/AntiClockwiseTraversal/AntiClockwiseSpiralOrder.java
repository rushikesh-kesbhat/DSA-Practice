package Spiral_Matrix.AntiClockwiseTraversal;

import java.util.Scanner;
import java.util.Stack;

public class AntiClockwiseSpiralOrder {
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

    private static void spiralMatrix(int[][] arr, int row, int col) {
       
        int toprow=0;
        int rightCol=col -1;
        int bottomRow=row -1;
        int leftCol=0;

        Stack<Integer> arrayStack= new Stack<>();

        int count=0;
    while (toprow <= bottomRow && leftCol <= rightCol) {

    // Top row
    for (int i = leftCol; i <= rightCol; i++) {
        arrayStack.push(arr[toprow][i]);
    }
    toprow++;

    // Right column
    for (int i = toprow; i <= bottomRow; i++) {
        arrayStack.push(arr[i][rightCol]);
    }
    rightCol--;

    // Bottom row (only if valid)
    if (toprow <= bottomRow) {
        for (int i = rightCol; i >= leftCol; i--) {
            arrayStack.push(arr[bottomRow][i]);
        }
        bottomRow--;
    }

    // Left column (only if valid)
    if (leftCol <= rightCol) {
        for (int i = bottomRow; i >= toprow; i--) {
            arrayStack.push(arr[i][leftCol]);
        }
        leftCol++;
    }
}
    while(!arrayStack.isEmpty()){
        
        System.out.print(arrayStack.pop()+" ");
    }

    }
}
