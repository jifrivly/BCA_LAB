import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    public void readdetails()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name:");
        name=s.nextLine();
        System.out.print("Enter roll number:");
        rollno=s.nextInt();
    }
    public void displaydetails()
    {
        System.out.println("Roll Number:"+rollno);
        System.out.println("Name:"+name);
    }
}

class Result extends Student
{
    int[] marks=new int[5];
    int total;
    double average;
    public void read()
    {
        readdetails();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        for(int i=0;i<5;i++)
        {
            marks[i]= s.nextInt();
        }
    } 
    public void display()
    {
        displaydetails();
        total=0;
        for(int i=0;i<5;i++)
        {
            total=total+marks[i];
        }
        average=(double)total/5;
        System.out.println("Total Marks:"+total);
        System.out.println("Average:"+average);
    }
}

class StudentDemo
{
    public static void main(String args[])
    {
        Result r = new Result();
        r.read();
        r.display();
    }
}