
public class PatternAssignment1Q5 {

	public static void main(String[] args) {
		int n = 14;
		int cp  = (n)/2;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i == 0 || i == n-1 || j == 0 || (i <=cp && i+j < cp) || ( i-j >= cp-1) ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}


	}

}
