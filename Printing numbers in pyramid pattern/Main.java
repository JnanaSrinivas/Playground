import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i,j,sp,val=1;
      for(i=1;i<=n;i++)
      {
        for(sp=1;sp<=n-i;sp++)
        {
          System.out.print(" ");
        }
         for(j=1;j<=i;j++)
        {
          System.out.print(val+" ");
           val++;
        }
        System.out.println();
     }    
  }
}