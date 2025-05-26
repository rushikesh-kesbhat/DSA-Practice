import java.util.Scanner;

class N_NaturalNo{
	
	static void printIncreaseFromNto1(int n){
		if(n==1){
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printIncreaseFromNto1(n-1);
	}
	
	static void printIncrease(int n){
		if(n==1){
			System.out.println(n);
			return;
		}
		printIncrease(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Natural No.: ");
		int n= sc.nextInt();
		
		printIncreaseFromNto1(n);
	}
	
}
