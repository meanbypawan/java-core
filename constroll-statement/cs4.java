import java.util.Scanner;
class TestMain{
  public static void main(String arg[]){
    int n;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter A Number...");
    n = sc.nextInt();
    // 5 or 11 divi...
    if((n%5==0) || (n%11==0))
      System.out.println(n+" is divisible by 5 or 11");
    else
      System.out.println("Not Divisible...");  
    
  }
}










