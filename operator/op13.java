class TestMain{
  public static void main(String arg[]){
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    
    //boolean x = (a > b) && (++c < d);
    //boolean x = (a > b) & (++c < d);
    boolean x = (a<b) | (++c>d);
    
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    System.out.println("c : "+c);
    System.out.println("d : "+d);
    System.out.println("x : "+x);
  }
}
