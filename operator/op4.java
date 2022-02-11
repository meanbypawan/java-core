/*
  Increment (++)
    1) Pre-increment :-
         Pre-increment first increment the value by one
         then assign 
         
       int x = 10;
       ++x;
        
    2) Post-increment :-
         Post increment first the assign the value then
         increment by one
         
       int x = 10;
       x++;  
  ----------------------------------------------------
  int x = 10,y;
  y = ++x; // x=11 , y=11
  
  x = x + 1
  y = x
  
  ----------------------------------------------------
  int x = 10,y;
  y = x++; //x = 11 y = 10 
  
  y = x
  x = x + 1
*/
class TestMain{
  public static void main(String arg[]){
     int x = 10,y;
     //y = ++x;
     y = x++;
     System.out.println("x : "+x+" y : "+y); // x = 11
  }
}






