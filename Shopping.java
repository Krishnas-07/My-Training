class Shopping
{ 
public static double amount(double a)
{if(a>5000)
{System.out.println(" The total amount is "+a);
}else
{System.out.println(" No Discount");
}
return a;
}
public static double discount(double d)
{ double dis=0.2;
double pay=d*dis;
 d=d-pay;
System.out.println(" The discounted amount is" +d);
return d;
}
public static void main (String args[])
{double u=Shopping.amount(20000);
double v=Shopping.discount(u);
}}

