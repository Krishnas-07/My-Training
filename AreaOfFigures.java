class AreaOfFigures
{
public static double areas(double r)
{
double pi=3.141;
double area=pi*r*r;
System.out.println("Area of Circle with radius" +r+ " is " +area);
return  area;
}
public  static double areas(double l,double b)
{
double rec=(l*b);
System.out.println("Area of rectangle is" +rec);
return rec;
}
public static int areas(int a)
{ 
int squ=a*a;
System.out.println("Area of  Square is "+squ);
return squ;
}
public static void main(String args[])
{
double s= AreaOfFigures.areas(5.6);
double u =AreaOfFigures.areas(4.5,5.9);
int v= AreaOfFigures.areas(10);
}}
