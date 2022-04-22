/*
 WAP to input an integer number between 1 to 5
 and then print number into the correspondin character form
 
 e.g
 n = 1 then o/p -> One
 n = 2 then o/p -> Two
*/
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    
    // n = 3
    if(n==1)
      System.out.println("One");
      
    if(n == 2)
      System.out.println("Two");
      
    if(n == 3)
      System.out.println("Three");
      
    if(n == 4)
      System.out.println("Four");
      
    if(n == 5)
      System.out.println("Five");         
  } 
}
