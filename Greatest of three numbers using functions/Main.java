import java.util.Scanner;
public class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    int res = great(n1,n2);
    int w = great(res,n3);
    System.out.print(w);
      
  }
  public static int great(int a,int b)
  {
    int max = 0;
    if(a>b)
    {
      max = a;
    }
    else
    {
      max = b;
    }
    return max;
  }
}