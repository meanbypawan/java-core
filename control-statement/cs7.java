/*
  Input a letter and check it vowel or not
*/
import java.util.Scanner;
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a letter...");
    char ch = sc.next().charAt(0);
    // ch = 'a','e','i','o','u','A','E','I','O','U'
    // char ---> unicode ---> integer
    // 'a' --> 97, 'b' -->98
    switch(ch){
       case 'a' : 
       case 'e' : 
       case 'i' : 
       case 'o' : 
       case 'u' : System.out.println("Vowel");break;
       default : System.out.println("Not Vowel..");
    }
  }
}
