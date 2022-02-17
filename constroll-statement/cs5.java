/*
  check positive or negative
  
  n > 0   +ve
  
  n < 0   -ve
  
  n == 0   zero
*/
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     Scanner sc =  new Scanner(System.in);
     
     System.out.println("Enter Number...");
     int n = sc.nextInt();
      
     if(n>0)
       System.out.println(n+ " is +ve");
     else
       if(n < 0)
         System.out.println(n+ " is -ve"); 
       else
         System.out.println(n+" is neither +ve nor -ve");
          
  }
}
