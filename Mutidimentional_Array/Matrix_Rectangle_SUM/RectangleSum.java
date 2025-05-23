import java.util.Scanner;

public class RectangleSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Of Rows");
        int row=sc.nextInt();
        System.out.println("Enter No. Of Columns");
        int col=sc.nextInt();
        
        int[][] arr= new int[row][col];

        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter co-ordinates first:");
        int r1= sc.nextInt();
        int c1=sc.nextInt();
        System.out.println("Enter co-ordinates Second:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        matrixSum(arr,row,col,r1,r2,c1,c2);
    }

    static void matrixSum(int[][] arr,int row,int col,int r1,int r2,int c1,int c2){
        int sum=0;
        for (int i=r1;i<=r2 ;i++ )
        {
            for (int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.println("Sum: "+ sum);
    }


    
}
