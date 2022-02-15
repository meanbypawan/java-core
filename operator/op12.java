class TestMain{
  public static void main(String args[]){
    int a,b,c,d;
    a = 10;
    b = 20;
    c = 30;
    d = 40;
    
    // To remove short-circuit behaviour use single pipe op.
    boolean x = (a<b) | (++c>d);
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c); // 30
    System.out.println(d);
    System.out.println(x); // true
    
  }
}
