import java.util.Scanner;

public class gitProject {

	public static void main(String[] args) {
		System.out.println( "Type in your input in the format: \"x, y\"" );
		Scanner scan = new Scanner( System.in );
		String input = scan.nextLine();
		
		System.out.println( input );
		
		int loc = input.indexOf( ',' );
		
		System.out.println( loc );
		
		int x = Integer.parseInt( input.substring( 0, loc ) );
		int y = Integer.parseInt( input.substring( loc + 2 ) );
		
		System.out.println( x + "\n" + y );
		
		System.out.println( "Your randomly generated number between your defined bounds is: " + ( ( int )( Math.random() * ( y - x ) ) + x ) );
		
		scan.close();
	}
	
}
