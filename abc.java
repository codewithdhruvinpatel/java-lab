interface A{
static final int a =1;
void display();
}
interface B extends A{
static final int b =1;
void display2();
}
public class abc implements B{
public void display(){
System.out.println("Display 1");
System.out.println("a = " + a);
}
public void display2(){
System.out.println("Display 2");
System.out.println("b = " + b);
}

public static void main(String args[]){
abc d = new abc();
d.display();
d.display2();
}
}