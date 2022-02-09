/*
  Syntax to declare variable
  
  datatype variable_name;
  datatype variable1, variable2;
  20,10 
  To store the data memory is required 
  variable is responsible to create a memory
  20 10

  Typecasting :-
    Process of converting one type of value into another
*/
class Test{
  public static void main(String args[]){
    byte a,b; // declaring varible
    byte c;
    a = 20; // storing data
    b = 10; // storing data in b
    
    c = (byte)(a+b); // 30 (int)
    System.out.println(c);
  }
}












