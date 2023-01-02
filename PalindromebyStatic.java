class PalindromebyStatic
{static int rem,rev=0;
public static int reverse(int n)
{
while(n!=0)
{
 rem=n%10;
rev=rev*10+rem;
n=n/10;
}
return rev;
}
public static int palindrome(int a)
{int temp=a;
if(temp==rev)
{
System.out.println("The given number is  Palindrome");
}
else 
{
System.out.println(" The given number is not  Palindrome");
}
return temp;
}
public static void main(String args[])
{
int num=2442;
int s=PalindromebyStatic.reverse(num);
int u=PalindromebyStatic.palindrome(num);
System.out.println("The reverse of " +num+"  is " +rev);
}}