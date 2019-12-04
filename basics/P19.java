import java.lang.*;
class P19
{
public static void main(String args[])
{
int i=5;
while(i>=2)
{
int count=0;
if(i%2==0&&i%3==0&&i%5==0)
{
 count++;
 i++;
 while(count<=5)
 System.out.println(i);
}
}
}
}
