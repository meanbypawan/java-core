// Increment , Decrement 
// ++ (increment by 1), -- (decrement by 1)
/*
   Increment :-
     a) Pre-increment
        int x=20;
        ++x;
        
        Pre-increment first increment the value by one
        then assign
        
     b) Post-increment
        int x = 20;
        x++;
        Post-increment first assign the value then increment
        by one
        
   Decrement:-
     a) Pre-decrement
     
     b) Post-decrement  
*/
class TestMain{
  public static void main(String args[]){
    int x = 10,y;
    y = ++x;
    /*
      x = 11
      y = 11
    */
    
    System.out.println("x : "+x+" y : "+y);
    
  }
}
