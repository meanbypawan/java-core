class TestMain{
  public static void main(String ar[]){
    int a,b,c,d;
    a = 5;
    b = 2;
    c = 3;
    //    6 * 2   - 3  /  5
    //    12 - 3 / 5
    //    12 - 0
    // 12
    d = ++a * b++ - c++ / ++c;
    /*
      a = 6
      b = 2,3
      c = 3,4,5
    */
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    System.out.println("c : "+c);
    System.out.println("d : "+d);
  }
}
