/*
  conditional operator
  syntax:-
  
  (condition/BE) ? expression-2 : expression-3;
   a > b
*/
// a,b
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 1st value....");
    int x = sc.nextInt();
    
    System.out.println("Enter 2nd value....");
    int y = sc.nextInt();
    
    /*
    x > y ? System.out.println("Greater : "+x) : 
               System.out.println("Greater : "+y);
    */
    
     int  z = (x > y) ? x : y;
     System.out.println("Greater : "+z);
    
  }
}
