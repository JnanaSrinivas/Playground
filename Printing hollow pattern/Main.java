import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int row = 1;row <= n;row++)
	    { 
            // Handle stars for each row
	        for(int col = 1;col <= n;col++)
	        {
                // Condition to print stars 
	            if((row == 1) || (col == 1) || 
                   (row == n) || (col == n))
	            {
	                System.out.print("*");
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
}