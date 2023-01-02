class VoteStatic
{
public static boolean citizen(int age)
{
if (age>=18)
{System.out.println(" Candidate is eligible for voting");
}else
{System.out.println(" Candidate is not eligible for voting");
}return true;
}
public static void main(String args[])
{ boolean s= VoteStatic.citizen(8);
}}