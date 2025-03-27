import java.io.*;
class swap
{
public static void main(String[] args)
{
int x=100,y=200;
System.out.println("BEFORE SWAPPING");
System.out.println("X=" + x);
System.out.println("Y=" + y);
int temp=x;
x=y;
y=temp;
System.out.println("AFTER SWAPPING");
System.out.println("X=" + x);
System.out.println("Y=" + y);
}
}