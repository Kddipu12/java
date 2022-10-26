import java.io.*;
import java.util.Scanner;
class Employee{
void printSalary(){
Scanner s=new Scanner(System.in);
System.out.println("Enter officer or manager");
String ask=s.nextLine();
if (ask.equals("officer")){
Officer o =new Officer();
o.Off();}
else{
Manager m= new Manager();
m.Man();}

System.out.println("Enter Name");
String name=s.nextLine();

System.out.println("Enter phone number");
long  ph=s.nextInt();

System.out.println("Enter Address");
String address=s.next();

System.out.println("Enter age");
int age=s.nextInt();

System.out.println("Enter salary");
long  salary=s.nextInt();

System.out.println("Salary="+salary);}

public static void main(String a[]){
Scanner s=new Scanner(System.in);

Employee emp=new Employee();
emp.printSalary();
}
}

class Officer extends Employee{
void Off(){
Scanner s=new Scanner(System.in);
System.out.println("Specialization:");
