import java.util.Scanner;
class inputScann{
public static void main(String args[]){
 Scanner n = new Scanner(System.in);
    System.out.println("Enter Name");
  String Name = n.next();
System.out.println("Enter age");
  String Age = n.next();
System.out.println("Hi " + Name + " Your Age Is " + Age);
}
}