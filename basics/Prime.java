import java.lang.*;
class Prime
{
 public static void main(String args[])
{
 int num=99;
 for(int i=10;i<=num;i++)
 {
  int count=0;
  for(int j=1;j<=i;j++)
  {
  if(i%j==0)
   {
     count++;
   }
  }
  if(count==2)
  {
   System.out.println(i);
  }
 }
}
}