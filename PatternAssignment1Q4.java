
public class PatternAssignment1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		int cp  = (n)/2;
		
		for(int i = cp ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(j == 0 || j == n-1 || i == n-1 || i == n-2 || ( i-j >= cp) || (i+j >= ((2*n) - cp-1))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
