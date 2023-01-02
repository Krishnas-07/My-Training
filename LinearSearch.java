class LinearSearch
{
public static void main(String args[])
{
int  a[]={100,200,300,1000,5000};
int search=1000;
boolean flag=false;
for(int i=0;i<a.length;i++)
{
if (search==a[i])
{
System.out.println(" Element found in array");
flag=true;
break;
}}if (flag==false)
{System.out.println("Element not found in array");
}}}