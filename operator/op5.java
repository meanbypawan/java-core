class TestMain{
  public static void main(String arg[]){
     int x=5,y;
     
     //   x = 9
     //    6 + 6   + 7   +   9
     y = ++x + x++ + x++ + ++x; // x = 9
     
     System.out.println("x : "+x);
     System.out.println("y : "+y);
  }
}
