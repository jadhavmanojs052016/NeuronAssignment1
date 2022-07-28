
public class PatternAssignment1Q1 {
	

	public static void main(String[] args) {
		
		int n = 10;
		int cp  = (n-1)/2; 
		//'NEURON'
		
		for(int i = 0 ; i < n ; i++) {
			//prints N
			for(int j = 0 ; j < n ; j++) {
				if(j == 0 || j == n-1 || i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Prints E
			System.out.print("  ");
			for(int j = 0 ; j < n ; j++) {
				if(j == 0 || i == 0 || i == n-1 || i == cp) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Prints U
			System.out.print("  ");
			for(int j = 0 ; j < n ; j++) {
				if((j == 0 && i != n-1) || (j == n-1 && i != n-1) || (i == n-1 && j != 0 && j != n-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Prints R
			System.out.print("  ");
			for(int j = 0 ; j < n ; j++) {
				if(j == 0 || (i == 0 && j != n-1) || (j == n-1 && i != 0 && i < cp) || (i == cp && j != n-1) || (j == i && i >= cp) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//Prints O
			System.out.print("  ");
			for(int j = 0 ; j < n ; j++) {
				if( ( (j == 0 || j == n-1) && i != 0 && i != n-1) || ((i ==0 || i == n-1) && j != 0 && j != n-1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			//prints N
			System.out.print("  ");
			for(int j = 0 ; j < n ; j++) {
				if(j == 0 || j == n-1 || i == j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}
		
	}
	
	static {
		System.out.println("This will print NEURON uding loops");
	}


}
