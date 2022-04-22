class TestMain{
  public static void main(String ar[]){
     int a,b;
     a = 10;
     //    11+ 11  +  13
     b = ++a + a++ + ++a;
     // a = 13
     // b = 35
     
     System.out.println("a : "+a);
     System.out.println("b : "+b);
  }
}
