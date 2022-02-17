/*
Write a  program to input basic salary of an employee 
and calculate its Gross salary according to following:
Basic Salary >= 10000 : HRA = 10%, TA = 5% EA = 3%
otherwise
  HRA : 5%,  TA = 3% is given  to the employee.

 DRY (Donot Repeat Yourself)
 KISS(Keep it Simple & short) 
*/
import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter Basic Salary of an employee..");
     int basicSalary = scan.nextInt();
     float hra,ta,ea=0,gs;
     if(basicSalary >=10000){
       // Do this task
       hra = (basicSalary*10)/100.0f;
       ta = (basicSalary*5)/100.0f;
       ea = (basicSalary*3)/100.0f;
     }
     else{
       // Do this task..
       hra = (basicSalary*5)/100.0f;
       ta = (basicSalary*3)/100.0f;
     }
     System.out.println("HRA : "+hra);
     System.out.println("TA : "+ta);
     
     if(ea!=0)
       System.out.println("EA : "+ea);
     
     gs = basicSalary + hra + ta + ea;
     System.out.println("Gross Salary : "+gs);
  }
}
