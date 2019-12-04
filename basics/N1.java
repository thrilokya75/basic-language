import java.lang.*;
Class N1
{
public static void main(String args[])
{
 int a=7;
 for(int i=1;i<(a/2);i++)
{
 int count=0;
 if(a%i==0)
    count++;
}
if(count==2)
 System.out.println("prime number");
else
  System.out.println("not a prime number");
}
}