import java.util.ArrayList;
import java.lang.*;
import java.util.Collections;

class Practice{
	public static void main(String[] args){
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(1);
		l.add(7);
		l.add(9);
		l.add(3);
		
		System.out.println(l);
		reversOrder(l);
		Collections.sort(l);
		System.out.println("Sort Using Collections: "+l);
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Reverse Order: "+ l);
	}
	
	static void reversOrder(ArrayList<Integer> l){
		
		//Using Loops
		int i=0,j= l.size() - 1;
		while(i<j){
			
			int temp= l.get(i);
			l.set(i,l.get(j));
			l.set(j,temp);
			
			i++;
			j--;
		}
		System.out.println("Reversing with Loops: "+ l);
		
		//Using Collections
		
		Collections.reverse(l);
		System.out.println("Reverse Using Collections"+l);
		
	}
}