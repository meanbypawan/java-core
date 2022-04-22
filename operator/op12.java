class TestMain{
  public static void main(String arg[]){
    int x = 20;
    boolean y;
    
    //y = ++x > 20;
    y = x++ > 20;
    /*
      y = 20 > 20
      x = 21
    */
    System.out.println(x);
    System.out.println(y);
  }
}
