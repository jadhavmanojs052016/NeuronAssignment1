
public class PatternAssignment1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 14;
		int cp  = (n)/2;
		
		for(int i = 0 ; i < n ; i++) {
			//prints N
			for(int j = 0 ; j < n ; j++) {
				if(i == 0 || j == 0 || j == n-1 || i == n-1 || (i <=cp && i+j < cp) || (i <=cp && j-i >= cp)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
