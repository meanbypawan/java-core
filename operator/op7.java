class TestMain{
  public static void main(String args[]){
    int x = 5;
    int y;
    //  ---------------------------->
    //    6 + 6   + 7   -   9 * 9
    /*
          6 + 6 + 7 - 81
          12 + 7 -81
          19 -81
          -62 
    */ 
    y = ++x + x++ + x++ - ++x * x++;
    /*
       x = 10
    */
    
    System.out.println("x : "+x);
    System.out.println("y : "+y);
    
  }
}
