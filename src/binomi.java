public class binomi {
	
	public static void main(String[] args) {
	
	}
	private static int i;
	public static int a( int k ) {
		for( i = 1; i < k; ++i ) {
		}
		return k;
	}
	public static int m( int k ) {
		int j = 0;
		for( i = 1; i <= k; ++i )
			 j *= a( i );
		return j;
	}
}