/*
   Operators
     1) Precedence
     2) Associativity
         a) Left ---> Right
         b) Right --> Left
         
     a + b * c / d
     
     a = 20; // Right---> Left     
*/
class TestMain{
  public static void main(String cheeku[]){
     int a = 10;
     int b = 10;
     int c = 10;
     int d = 10;
     
     boolean x = (a == b) == (c == d);
     /*  
                  (10==10)
                     true == (c==d)
                     true == (10 == 10)
                     true == true
                        true         
     */
     System.out.println(x);
  }
}
