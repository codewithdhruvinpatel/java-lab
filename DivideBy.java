class DivideBy{
public static void main(String args[]){
int a=10;
int b=5;
try{
int c = a/b;
System.out.println(c);
int d = a/0;

}
catch(ArithmeticException e){
System.out.println(e);
}
finally{
System.out.println("Finally Block");
}
}
}