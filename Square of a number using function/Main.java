import java.util.Scanner;
class Main
{
  public static int sqr(int a)
  {
    int c= a*a;
    System.out.print(c);
    return c;
  }
    
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = sqr(a);
	} 
}