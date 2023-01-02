class PalindromebyMethod
{
int  num,sum=0,rem=0;
public int reverse(int num)
{
while(num!=0)
{
rem=num%10;
sum=sum*10+rem;
num=num/10;
}
return sum;
}
public int checkPalindrome(int num)
{ 
int temp=num;
if (sum==temp)
{System.out.println("Given number is palindrome" );
}else
{System.out.println("Given number is  not palindrome" );
}
return num;
}
public static void main(String args[])
{
int num=13531;
PalindromebyMethod obj=new PalindromebyMethod();
int s=obj.reverse(num);
int u= obj.checkPalindrome(num);
System.out.println("The number is " +num);
System.out.println("The reverse of number is " +s);
}}