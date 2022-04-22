/*
  Arithemetic (+,-,*,/,%)
  Logical Op ( &&, ||, !)
  Relational Op (>,<,>==,<=, ==, !=)
  Increment / Decrement (++, --)
  
  conditional Operator ( ? : )
  
  syntax :
  
  condition/BE ? expression-2 : express-3;
  
   int x =  a>b ? 20 : 10;
*/
import java.util.Scanner;
class TestMain{
  public static void main(String ar[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter value of a");
    int a = sc.nextInt();
    
    System.out.println("Enter value of b");
    int b = sc.nextInt();
    
    int max;
    
    max = (a > b) ? a : b;
    System.out.println("Greater : "+max); 
    
  }
}














