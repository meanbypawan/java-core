class TestMain{
  public static void main(String arg[]){
    int a,b,c,d;
    a = 10;
    b = 20;
    c = 30;
    d = 40;
    
    boolean x = (a>b) && (++c<d) || (++a<b);
    /*
       x = (a>b)
             false && (++c<d)
                   false || (++a<b)
                   false || 11<20
                   false || true
                        true 
    */ 
    
    System.out.println(a); // 11
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(x);
  }
}
