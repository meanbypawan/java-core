class TestMain{
  public static void main(String args[]){
    int a,b,c,d;
    a = 10;
    b = 20;
    c = 30;
    d = 40;
    
    //boolean x = (a<b) && (++c<d); // Circuit
    boolean x = (a>b) & (++c<d);
    /*
       AND -: Short- Circuit Operator
       
       x = (10<20) && (++c<d)
       x =  true && (++c<d)
    */
    System.out.println(a); // 10
    System.out.println(b); // 20
    System.out.println(c); // 30
    System.out.println(d); // 40
    System.out.println(x); // false
  }
}
