class Purchase
{
public double totalprice(double a)
{
if(a>5000)
{ System.out.println("The total Bill amount is "+a);
}
else
{
System.out.println("No Discount");
}
return a;
}
public double discount(double b)
{
double d=0.2;
double amount;
amount=b*d;
b=b-amount;
System.out.println("The net amount is" +b);
return b;
}
public static void main(String args[])
{
Purchase obj=new Purchase();
double s=obj.totalprice(8000);
double u=obj.discount(s);
}}
