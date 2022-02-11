/*
   int n = 123; // 123 ---> 12
   
   int r = n%10; // r=3, n=123

   n = n/10; // 123/10 --> 12
*/
class TestMain{
  public static void main(String args[]){
    // Relational Operator (Binary)
    /*
      (byte,short, int, long, float, double,char)
      a > b  (Relational Exp :- Relational Exp always
        generate boolean value as output
      )
      a < b  : true , false
      a == b
      a != b
      a >= b
      a <= b
    */  
    /*
      int a,b;
      a = 20;
      b = 10;  
    
      boolean result = a > b;
      System.out.println(result); // true
    */
    System.out.println(" 20 > 10 "+(20>10)); // true
    System.out.println(" 20 < 10 "+(20<10)); // false
    System.out.println(" 20 >= 20 "+(20>=20)); // false
    System.out.println(" 20 <= 10 "+(20<=10)); // false
    System.out.println(" 20 != 10 "+(20!=10)); // true
    System.out.println(" 20 == 10 "+(20==10)); // false
    
  }
}




