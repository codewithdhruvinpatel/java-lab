import java.util.Scanner;

class mulTable{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number: ");
int n = sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println("n"+n+"*"+"i"+i+"="+n*i);
}

}
}