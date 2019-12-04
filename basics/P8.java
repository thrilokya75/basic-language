import java.lang.*;
class P8
{
public static void main(String args[])
{
int age=Integer.parseInt(args[1]);
String a=args[0];
if(a.equals("female")&&(age>=1||age<=58))
{
 System.out.println("intrest is 8.2%");
}
if((age>=59||age<=120)&&a.equals("male"))
{
 System.out.println("intrest is 7.6%");
}
if((age>=1||age<=60)&&a.equals("male"))
{
System.out.println("intrest is 9.2%");
}
if((age>=61||age<=120)&&a.equals("female"))
{
System.out.println("intrest is 8.3%");
}
}
}