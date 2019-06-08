import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a=0,b=0,c=0;
       a=n%10;
      while(n>0)
      {
        b=n%10;
        n=n/10;
	  }
      c=a+b;
      System.out.println(c);
    }
}