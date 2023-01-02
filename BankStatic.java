class BankStatic
{
public static int deposit(int d)
{
System.out.println("The amount deposited is" +d);
return d;
}
public static int withdraw(int w)
{
System.out.println("The amount withdrawed is" +w);
return w;
}
public static int balance(int d,int w)
{int b=d-w;
System.out.println(" The balance amount is "+b);
return b;
}
public static void main(String args[])
{
int s= BankStatic.deposit(26000);
int u=BankStatic.withdraw(5000);
int v=BankStatic.balance(s,u);
}}
