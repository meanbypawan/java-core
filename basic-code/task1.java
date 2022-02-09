/*
  3.14 * radius * radius
*/
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    float radius; 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Radius......");
    radius = sc.nextFloat(); //radius =  2.3
    
    System.out.println("Area of circle : "+(3.14*radius*radius));
    
  }
}
