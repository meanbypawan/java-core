/*
  Why byte ?
  
  int x = 20;    // 4 byte
  short y = 20;  // 2 byte
  
  10100
  
  -128 to + 127 ---> byte
  
  datatype       memorysize		range
  byte		  1-byte	-128 to +127
  short	 	  2- byte       -2^15 to 2^15-1(-32768 to + 32767)
  int 		  4-byte	-2^31 to 2^31-1(-2147483648 to 2147483647)
  long		  8-byte	-2^63 to 2^63-1
  
  8 byte means 64 bit
  
  out of 64-bit, 1-bit reserved for the sign bit
  remaining bit is 63
  
  -2^63 to 2^63-1         
   			
  
*/ 
class Test{
  public static void main(String args[]){
    short a,b,result;
    a = 20;
    b = 10;
    result =(short)(a + b);
    
    // c.E :-- Incompatible type possible lossy conversion from int to short
    System.out.println(result);     
  }
}









