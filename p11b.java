class p11b extends Exception
{
public static void main(String args[]) throws NullPointerException
{
try
{
System.out.println("Inside try block.");

throw new NullPointerException("ThrowingNullPointer Exception.");

}
catch(NullPointerException e)
{
System.out.println("Caught Exception: "+e);
}
finally
{
System.out.println("This is finally block.");
}
}
}