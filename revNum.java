import java.util.Scanner;

class revNum{
public static void main(String args[])
{
int rev=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
int n = sc.nextInt();
while(n!=0){
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("Reverce Of Number Is : " + rev);
}
}