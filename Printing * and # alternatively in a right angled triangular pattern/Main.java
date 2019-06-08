import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int i,j;
       int turn=0;
      int n = in.nextInt();
      //int m = in.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
         {
            if(turn==0)
            {
              System.out.print("*");
              turn=1;
            }
          else
          {
            System.out.print("#");
            turn=0;
          }
      
      }
        System.out.println( );
     }
  }
}