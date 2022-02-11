class TestMain{
  public static void main(String arg[]){
     int a =10, b=20, c=30, d=40;
     
     a = ++b; // a =21, b=21, c=30, d=40   
     b = c--; // a =21, b=30, c=29, d=40
     d = a++; // a =22, b=30, c=29, d=21
     c = b--; // a =22, b=29, c=30, d=21
     d = ++a; // a =23, b=29, c=30, d=23
     a = --d; // a =22, b=29, c=30, d=22
     
     // Naayansh :- 22, 29, 30, 23
     // oorjit ; -  22, 29, 30 , 22
     // Aarjav ;-  21, 29, 29, 11
     System.out.println(a); 
     System.out.println(b); 
     System.out.println(c); 
     System.out.println(d);
  }
}
