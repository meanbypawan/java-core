import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Three Number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int max = (a>b&&a>c) ? a : 
                    (b>c) ? b : c; 
  
    System.out.println("Greater : "+max);
  }
}
