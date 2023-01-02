class Armstrong
{
public static void main(String args[])
{int n=1560;
int temp=n,r,sum=0;
while(n!=0){
r=n%10;
sum=sum+r*r*r*r ;
n=n/10;
}if(temp==sum)
{
System.out.println( "Number is Armstrong");
}else
{System.out.println( "Number is not Armstrong");
}}}