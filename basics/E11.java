import java.io.*;
import java.util.*;
class E11
{
public static void main(String args[])
{
int n;
System.out.println("enter n values");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
switch(n){
case 0:System.out.println("january");
        break;
case 1:System.out.println("febraury");
        break;
case 2:System.out.println("march");
        break;
case 3:System.out.println("april");
        break;
case 4:System.out.println("may");
        break;
case 5:System.out.println("june");
        break;
case 6:System.out.println("july");
        break;
case 7:System.out.println("august");
        break;
case 8:System.out.println("september");
        break;
case 9:System.out.println("october");
        break;
case 10:System.out.println("november");
        break;
case 11:System.out.println("december");
        break;
default:System.out.println("invalid");
}
}
}