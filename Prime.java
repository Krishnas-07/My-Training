class Prime
{
public static void main(String args[])
{
int n=13,middle,flag=0;
middle=n/2;
if (n==0||n==1)
{System.out.println(n+ " is not Prime");
}else
for(int i=2;i<=middle;i++)
{
if(n%i==0){
System.out.println(n+ " is not Prime");
flag=1;
break;
}}
if (flag==0)
{System.out.println(n+ " is  Prime");
}}}