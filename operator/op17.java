class TestMain{
  public static void main(String arg[]){
    byte a = 10;
    
    //a = a + 5; // Loss conversion from int to byte
    a += 5;
    System.out.println(a); // 15
  }
}
