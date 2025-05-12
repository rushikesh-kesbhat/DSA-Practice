import java.util.*;
import java.util.stream.IntStream;
class Practice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr1= getArray(sc);
        int[][] arr2= getArray(sc);
        add(arr1,arr2);

    }
    static void mul(int[][] arr1,int arr22[][]){
        int[][] mul=new int[arr1.length][arr1[].length];
    }
    static void add(int[][] arr1,int[][] arr2){

        int[][] sum=new int[arr1.length][arr1.length];
        for(int i=0;i<arr1.length ;i++){
            for(int j=0;j<arr1[i].length ;j++){
                sum[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        printArray(sum);
    }

    static void printArray(int[][] arr){
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    static int[][] getArray(Scanner sc){
        System.out.println("Enter no. of Rows and columns");
        int row= sc.nextInt();
        int col= sc.nextInt();

        System.out.println("Enter Matrix Elements:");
        return IntStream.range(0, row)
                .mapToObj(i -> IntStream.range(0, col).map(j -> sc.nextInt()).toArray())
                .toArray(int[][]::new);
    }
}