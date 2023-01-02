public class College
{
String name;
int rollnumber;
String collegename;
public College(String name,int rollnumber,String collegename)
{
this.name=name;
this.rollnumber=rollnumber;
this.collegename=collegename;
}
public void display()
{
System.out.println("Name is " +name);
System.out.println("Roll number is " +rollnumber);
System.out.println("College name is " +collegename);
}
public static void main(String args[])
{ 
College s1=new College("krishnapriya",25,"SreeBuddha");
s1.display();
}}
