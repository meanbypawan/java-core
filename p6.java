/*
  0 to -2147483648
  0 to 2147483647
----------------------------------------
 points to remember
  b + b = i
  s + s = i
  b + s = i
  b + i = i
  s + i = i
  i + i = i
  L + i = L
  L + L = L
  ----------------------
      No Typecasting
  ---------------------------->
  1) byte--->short--->int--->long
  
  2)byte<---short<---int<---long 
    <---------------------------
      Typecasting is required
  
*/
class Test{
  public static void main(String args[]){
    byte aByte;
    short bShort;
    int cInt;
    long dLong;
    aByte = 10;
    bShort = 20;
    cInt = 30;
    dLong = 40;
    
    cInt = (int)dLong; // Error    
  }
}
