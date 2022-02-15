class TestMain{
  public static void main(String args[]){
     int x = 5;
     
     boolean result = x++ > 5;
     
     System.out.println("x : "+x); // 6
     System.out.println("Result : "+result);
  }
}
