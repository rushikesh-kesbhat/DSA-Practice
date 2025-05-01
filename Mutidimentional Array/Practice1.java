import java.util.Scanner;
import java.util.stream.IntStream;


public class Practice1{

    void printArray(int[][] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println();
            for(int j=0;j< arr[i].length;j++){
                System.out.print(" "+ arr[i][j]);

            }
        }
    }

    int[][] getStraeamArray(){
        Scanner sc= new Scanner(System.in);
        System.out.println("size of a row");
        int row= sc.nextInt();
        System.out.println("size of a Column");
        int col =sc.nextInt();
        System.out.println(col +"   "+ row);
        System.out.println("Enter Array Elements");
        // int[][] arr= new int[row][col];
        // for(int i=0; i< row;i++){
        //     System.out.println("Enter Row:");
        //     for(int j=0; j<col;j++){
        //         arr[i][j]= sc.nextInt();
        //     }
        // }
// This is simple

        // IntStream.range(0,row).forEach(i->{
        //     System.out.println("Enter Row:");
        //     IntStream.range(0,col).forEach(j->{
        //         arr[i][j]=sc.nextInt();
        //     });
        // });
// Lets do more complex

    return IntStream.range(0,row).mapToObj(i->{
        System.out.println("Enter "+i+" Row:");
        return IntStream.range(0,col).map(j-> sc.nextInt()).toArray();
    }
    ).toArray(int[][]:: new);
    }


     public static void main(String[] args){
        Practice1 practice = new Practice1();
        // practice.printArray(practice.getArray());
        practice.printArray(practice.getStraeamArray());
}



 int[][] getArray(){
        Scanner sc= new Scanner(System.in);
        System.out.println("size of a row");
        int row= sc.nextInt();
        System.out.println("size of a Column");
        int col =sc.nextInt();
        System.out.println(col +"   "+ row);
        System.out.println("Enter Array Elements");
        int[][] arr= new int[row][col];
        for(int i=0; i< row;i++){
            System.out.println("Enter Row:");
            for(int j=0; j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        return arr;
    }
}