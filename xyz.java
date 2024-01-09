interface A{
static final int a =1;
void display();
}
public class xyz implements A{
public void display(){
System.out.println("Interface Demo");
System.out.println("a = " + a);
}

public static void main(String args[]){
xyz d = new xyz();
d.display();
}
}