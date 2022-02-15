// conditional operator
/*
  Syntax:--
  
  (condition/BE) ? expression 2 : expression 3;
  
  if condition is true the it will evaluate express-2
  if condition is false then it will evaluate expression-3
*/
import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter 1st value");
     int a = sc.nextInt();
  
     System.out.println("Enter 2nd value");
     int b = sc.nextInt();
                            
     System.out.println("Enter 3rd value");
     int c = sc.nextInt(); 
    
     /*
       a,b,c
       a > b ---> x
       x > c ---> Greatest     
     */
     
     /*
     int x = (a>b) ? a : b;
     int y = (x > c) ? x : c;
     System.out.println("Greate Value : "+y); 
     */
     int x = (a>b && a>c) ? a : (b>c) ? b : c; 
     
     System.out.println("Greate Value : "+x); 
  }
}















