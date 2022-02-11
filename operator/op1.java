// Arithmetic Operations
// + , -, *, /, %
class TestMain{
  public static void main(String ars[]){
     System.out.println("5/2 : "+(5/2)); // 2
     System.out.println("2/5 : "+(2/5)); // 0
     
     System.out.println("5%2 : "+(5%2)); // 1
     System.out.println("5.5%2 : "+(5.5%2)); // 1.5
     System.out.println("-5%2 : "+(-5%2)); // -1
     System.out.println("5%-2 : "+(5%-2)); // 1
     System.out.println("-5%-2 : "+(-5%-2)); // -1
     System.out.println("2%5 : "+(2%5)); // 2 (num < de)
     System.out.println("99%100 : "+(99%100));// 99
     //System.out.println("5/0 : "+(5/0)); // AE- Terminate 
     System.out.println("5.5/0 : "+(5.5/0)); // Infinity
     System.out.println("-5.5/0 : "+(-5.5/0)); // -Infinity
     //System.out.println("5%0 : "+(5%0));
     System.out.println("5.5%0 : "+(5.5%0));
     System.out.println("At the end.......");
     /*
       integer / 0 :- Arithmetic Exception
     */
  }
}
