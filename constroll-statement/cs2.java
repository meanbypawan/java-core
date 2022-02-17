/*
 1) if(condition/boolean_expression)
     statement---1;
 
 2) if(condtion/BE)
      statement--1;  
    statement-2;    
    
 3) if(condition/BE){
       statement---1;
       statement---2;
       statement---3;
    }    
 4) if(condition/BE)
     statement---1;
    else 
     statement----2;
 5) if(condition/BE){
      statement---1;
      statement----2;
    }   
    else
     Statement---3;
 6) if(condition/BE){
      
    }    
    else{
      statement---1;
      statement---2;
    }
     
  let suppose if condition is false        
*/
import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
    int n;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter A Number...");
    n = sc.nextInt();
    // n = 5
    if(n>10){
      System.out.println("Indore...");
      System.out.println("Pune...");  
    }
    else
      System.out.println("Chennai....");
  }
}










