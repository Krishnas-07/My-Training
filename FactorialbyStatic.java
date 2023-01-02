class FactorialbyStatic
{ 
public static int factorial(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{ fact=fact*i;
}
System.out.println(" The factorial of " +n+"  is" +fact);
return fact;
}
public static void main(String args[])
{int s=FactorialbyStatic.factorial(5);
}}