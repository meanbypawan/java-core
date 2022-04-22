// Switch Statement
/*
  switch(expression){
    case case_lable : statement---1; break;
    case case_label : statement ---2; break;
    .
    .
    .
    .
    
  }
  
  switch expression may be integer(byte,short,int) and string,char,long)
  
  float , double can not be used as switch expression
*/
import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter A Number b/w 100 to 104");
     int n = sc.nextInt();
     // n = 1,2,3,4,5
     // n = 100,101,102,103,104
     //int a = 103,b=1;
     
     // n = 107
     switch(n){
       case 101: System.out.println("One hundred");
               break;
       case 100: System.out.println("Hundred and one");
               break;
       case 102: System.out.println("Hundred and Two");
               break;
       case 103: System.out.println("Hundred and Three");
               break;
       case 103+1: System.out.println("Hundred and Four");
               break;
       default: System.out.println("Invalid Nummber...");
     }
     System.out.println("Out of the switch block...");
  }
}













