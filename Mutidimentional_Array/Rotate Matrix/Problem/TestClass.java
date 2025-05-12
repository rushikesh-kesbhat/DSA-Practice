//https://www.hackerearth.com/practice/data-structures/arrays/multi-dimensional/practice-problems/algorithm/gift-for-almas-3-33d2f7c7/
import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;

class TestClass {
    public static void main(String args[] ) throws Exception {
          Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr= IntStream.range(0,n).mapToObj(i->{
            return IntStream.range(0,n).map(j->sc.nextInt()).toArray();
            }).toArray(int[][]::new);
        String op= sc.next();
        printMatrix(arr,op);

    }

    static int[][] rotate(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]= temp;
            }
        }

        return arr;
    }
    static int[][] reverseOrderRight(int[][] arr){
         arr=rotate(arr);
        for(int i=0;i<arr.length;i++){
             int left=0;
            int right=arr[i].length-1;
            while(left<right){
                int temp= arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]= temp;
                left++;
                right--;
            }
        }
        return arr;
           
    }
    static int[][] reverseOrderleft(int[][] arr){
        arr=rotate(arr);
        for(int i=0;i<arr.length;i++){
             int left=0;
            int right=arr[i].length-1;
            while(left<right){
                int temp= arr[left][i];
                arr[left][i]=arr[right][i];
                arr[right][i]= temp;
                left++;
                right--;
            }
        }
        return arr;
           
    }
    

    public static void printMatrix(int[][] matrix,String op) {
    for(int j=0;j<op.length();j++){
        if(op.charAt(j)=='R'){
           matrix= reverseOrderRight(matrix);
        }
        else{
            matrix= reverseOrderleft(matrix);
        }
    }
    System.out.println();
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            System.out.print(matrix[i][j]+" ");

        }
        System.out.println();
    }
}
}
