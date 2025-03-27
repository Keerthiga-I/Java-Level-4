import java.io.*;
class sum
{
public static void main(String[] args)
{
int N=10;
int sum=0;
System.out.println("Finding Sum of" + N + "Numbers");
for(int i=1;i<=N;i++)
{
sum+=i;
}
System.out.println("Sum Of First" + N + "Natural Numbers=" +sum);
}
}