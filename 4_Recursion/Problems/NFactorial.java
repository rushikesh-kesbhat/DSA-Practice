import java.util.Scanner;

class NFactorial{
	
	public static void factorial(int n,int ans){
		
		if(n==1){
			System.out.println(ans);
			return;
		}
		ans*=n;
		factorial(n-1,ans);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int ans=1;
		 factorial(n,ans);
	}
}
