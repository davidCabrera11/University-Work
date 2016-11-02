import java.util.*;
public class smallestNumber {
  
  public static final Scanner reader = new Scanner (System.in);
  public static void main(String[] args) { 
    
    System.out.print("Enter amount of numbers: ");
    double totalNumber = reader.nextDouble();
    
    System.out.println("Enter first number");
    double min = reader.nextDouble(); 
      
    for(int i = 2; i <= totalNumber ; i++){
      System.out.println("Enter next number: ");
      double next = reader.nextDouble();
     
      if(min > next){
        min = next; 
        
      }  
      
    }
    System.out.println("The smallest number here is: " + min);
    
  }
  /* double Math.min(double value1,double value2)  */
}
