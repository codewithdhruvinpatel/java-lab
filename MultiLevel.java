class ValueA{
int a=10,b=20;
void valueAnB(){
System.out.println("Value Of A Is: "+a);
System.out.println("Value Of B Is: "+b);
}
}
class display extends ValueA{
void display(){
int sum = a + b;
System.out.println("Sum Of A & B Is :" +sum);
}
}
class MultiLevel extends display{
public static void main(String args[]){
display v = new display();
v.display();
}
}