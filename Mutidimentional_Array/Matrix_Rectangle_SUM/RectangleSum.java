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

        matrixSum1(arr,row,col,r1,r2,c1,c2);
    }
//With For Loops
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
	// Using row Prefix sum
	static void matrixSum1(int[][] arr,int row,int col,int r1,int r2,int c1,int c2){
		for(int i=0;i<row;i++){
			for(int j=0;j< col;j++){
				if(j>0){
					arr[i][j]+=arr[i][j-1];
				}
			}
		}
        for(int i=0;i<row;i++){
			for(int j=0;j< col;j++){
				if(i>0){
					arr[i][j]+=arr[i-1][j];
				}
			}
		}
		
		
		int sum=arr[r2][c2];
			
		if(r1>0)
			sum	-=arr[r1-1][c2];
		if(c1>0)
			sum	-=arr[r2][c1-1];
		if(r1>0 && c1>0)		
			sum +=arr[r1-1][c1-1];
		printArray(arr);
		System.out.println("arr1"+ arr[r2][c2]+"arr2"+ arr[r1][c2]+ "arr3"+ arr[r1][c2]+"arr4"+ arr[r2][c1]+"sum: "+sum);
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
