import java.util.Scanner;
class Main {
	public static void main (String[] args) {
       Scanner in= new Scanner(System.in);
		int a= in.nextInt();
        int b= a%10000;
        int c= b%1000;
        int d= c%100;
        int e= d/10;
      System.out.println(e);
    }
}