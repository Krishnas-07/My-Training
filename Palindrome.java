class Palindrome
{
public static void main(String args[])
{
int number=123321;
int temp=number,r,reverse=0;
{System.out.println("The Number is"+number);
}
while(number>0){
r=number%10;
reverse=reverse*10+r;
number=number/10;}
if(temp==reverse)
{System.out.println("The Series is Palindrome");
}else{
System.out.println("The Series is Not Palindrome");
}}}