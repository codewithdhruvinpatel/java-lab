class Demo{
int a =20;
void print(){
int a = 10;
System.out.println(a);
System.out.println(this.a);
}
}
class ThisKeyWord{
public static void main(String args[]){
Demo d = new Demo();

d.print();
}
}