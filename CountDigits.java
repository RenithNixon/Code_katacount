import java.util.*;
class CountDigits
{
public static void main(String args[])
{
int n,count=0,rem=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n!=0)
{
rem=n%10;
count++;
n=n/10;
}
System.out.println("The number of digits in the given integer is:"+count);
}
}

