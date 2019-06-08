import java.util.Scanner;
class Faculty
{
  public void salary(int base)
  {
   System.out.println("Base Salary:"+" "+base);
  }
}
class CSE extends Faculty
{
  public void salary(int base)
  {
    System.out.println("CSE Faculty:"+" "+(base+3000));
  }
}
class IT extends CSE
{
  public void salary(int base)
  {
     
    System.out.println("IT Faculty:"+" "+(base+5000));
    //write your IT class statements
  }
}
class ECE extends IT
{
  public void salary(int base)
  {
    System.out.println("ECE Faculty:"+" "+(base+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
     Scanner in =new Scanner(System.in);
     int base = in.nextInt(); 
   if(base>0) 
   {
    Faculty ob1 = new Faculty();
    ob1.salary(base);
    CSE ob2 = new CSE();
    ob2.salary(base);
    IT ob3 = new IT();
    ob3.salary(base);
    ECE obj = new ECE();
    obj.salary(base);
   }
    else
    {
      System.out.println("null");
    }
    	
  }
}