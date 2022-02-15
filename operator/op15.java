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
     
    //Error- (a > b) ? System.out.println(a) : System.out.println(b); 
  
    int x = (a>b) ? a : b;
    System.out.println("Greate Value : "+x); 
  }
}













