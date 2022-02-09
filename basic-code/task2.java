import java.util.Scanner;
/*
   Input marks of 5 subject of a student
   and then calculate per.

   Type of Marks : integer
   per :- float
*/
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
     int c,cpp,java,angular,android;
     float per;
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter C Marks...");
     c = sc.nextInt();
     
     System.out.println("Enter CPP Marks");
     cpp = sc.nextInt();
     
     System.out.println("Enter Java Marks");
     java = sc.nextInt();
     
     System.out.println("Enter Angular Marks");
     angular  = sc.nextInt();
     
     System.out.println("Enter Android Marks");
     android = sc.nextInt();
  
     per = (c+cpp+java+angular+android)/5.0f; // i/f = f
      
     System.out.println("Per : "+per);
  }
}
