class TestMain{
  public static void main(String ar[]){
    int a,b,c,d;
    a = 5;
    b = 2;
    c = 3;
    //    6 * 2   - 3   /   3 +   5
    //    12 - 3 / 3 + 5
    // 12  - 1 + 5
    // 11 + 5
    // 16
    d = ++a * b-- - c++ / --c + --a;
    /*
      a = 5,6,5
      b = 2,1
      c = 3,4,3
      d = 
    */
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    System.out.println("c : "+c);
    System.out.println("d : "+d);
    // 5,1,c = 1,10
    // 5,1,3,16
  }
}
