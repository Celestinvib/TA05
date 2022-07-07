
public class UnoApp {

	public static void main(String[] args) {
		int X = 10;
		int Y = 9;
		
		check(X,Y);
		
		Y = 8;
		X = 7;		
		check(X,Y);

		Y = 7;
		check(X,Y);
	}
	
	public static void check(int X, int Y) {
		if(X > Y) {
			System.out.println("X > Y");
		}else if (X < Y) {
			System.out.println("X < Y");
		}else {
			System.out.println("X = Y");
		}
	}
	

}
