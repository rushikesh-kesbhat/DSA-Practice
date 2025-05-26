import java.util.*;

public class CreatepascaltriangleToN {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no. upto you want to create a Pascal triangle");
        int n= sc.nextInt();
        printArray(pascalTriangle(n));

    }
    public static int[][] pascalTriangle(int n){
        int[][] arr=new int[n][];

        for(int i=0;i< arr.length;i++){
            arr[i]= new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            for(int j=1;j<=i-1;j++){
                arr[i][j]=arr[i-1][j] + arr[i-1][j-1];
            }
        }
        return arr;
        
    }
       static void printArray(int[][] arr){
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}