import java.util.Scanner;
// Logical AND :- When we want both condition true
// Logical OR :- When we want anyone condition true

// Logical AND ShrotCircuit :- When first condition is false
// Loical OR ShortCircuit :- When first condition is true
class TestMain{
  public static void main(String arg[]){
    int a,b,c,d;
    boolean result;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 4 values...");
    a = sc.nextInt(); // 10
    b = sc.nextInt(); // 20
    c = sc.nextInt(); // 30
    d = sc.nextInt(); // 40
    
    //result = (a > b) && (c < d);
    result = (a<b) || (c>d);
    /*
           =  (10 < 20)
           =   true || (c < d) 
       result = true
    */
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    System.out.println("c : "+c);
    System.out.println("d : "+d);
    System.out.println("Final Result : "+result);
  }
}
