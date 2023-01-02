class Average
{
public static int number(int a,int b)
{ 
int avg1=(a+b)/2;
System.out.println("The average of given numbers is "+avg1);
return avg1;
}
public static float number(float a,float b, float c)
{
float avg2;
avg2=(a+b+c)/3;
System.out.println("The average of given number is " +avg2);
return avg2;
}
public static void main(String args[])
{ 
int s= Average.number(22,24);
float u=Average.number(66f,85f,95f);
}}
