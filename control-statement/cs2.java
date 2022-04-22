/*
 Q.14)
  Write a C program to input basic salary of an employee and calculate its Gross salary according to following:
  Basic Salary <= 10000 : HRA = 20%, DA = 80%
  Basic Salary <= 20000 : HRA = 25%, DA = 90%
  Basic Salary > 20000 : HRA = 30%, DA = 95%
 
   basicSalary = 15000
 
  Algorirthm:
  step-1 :- Start
  step-2: Input basic salary as basicSalary
  
  step-3: check if basicSalary < 10000 then
           calculat hra = (basicSalary*20)/100;
           da = (basicSalary*80)/100
  
  step-4: check if basicSalary>10000 && basicSalary<=20000 then
           calculate hra = (basicSalary*25)/100
           and da = (basicSalary*90)/100
  step-5 : check if basicSalary >2000 then
           calcualte hra = (basicSalary*30)/100
           and da = (basicSalary*95)/100
  
  step-:6 : grossSalary = basicSalart + hra + da
  
  step:7- print grossSalary
  
  step:8- Stop                            
  ----------------------------------
  1. DRY (Do not repeat yourself)
  2. KISS (Keep It Simple & Short)

*/
import java.util.Scanner;
class GrossSalaryCalculation{
   public static void main(String args[]){
      int basicSalary; // 10000
      float hra=0,da=0,gs=0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Your Basic Salary");
      basicSalary = sc.nextInt();
   
      // 5000
      if(basicSalary < 10000){
        hra = (basicSalary*20)/100.0f;
        da = (basicSalary*80)/100.0f;
      }
      
      else if(basicSalary>=10000 && basicSalary<20000){
             hra = (basicSalary*25)/100.0f;
             da = (basicSalary * 90)/100.0f;
           }
           else{
                 hra = (basicSalary*30)/100.0f;
                 da = (basicSalary*95)/100.0f;
           }
      
      gs = basicSalary + hra + da;
      
      System.out.println("HRA : "+hra);
      System.out.println("DA : "+da);
      System.out.println("Gross Salary : "+gs);
   } 
}
