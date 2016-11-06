import java.awt.*;

public class CS1063ExamTwo {
  
  /*
   CS1063  Fall 2016 Exam One.   Total pts: 100
   
   You may use books, notes, example code, etc.
   
   
   
   The test is representative of the lab assignments, lab3, lab4, lab5.   
   The test also reflects the interactive assignments we have been doing in class.
   And project2
   
   
   CALL EACH METHOD from main(). Follow each method call with a newline.
   */
  
  public static void main(String[] args) { 
    
    myName();
    System.out.println();
    
    
    int dressSize = 8;
    
    dressDecision(Color.GREEN,Color.RED, dressSize);
    
    
    System.out.println();
    
    median(8,9,2);
    
    String s = "99BottleOfBierOnTheWall99BotlesOfBier,TakeOneDownPassItAround,98BottlesOfBierOnTheWall";
    
    countLettersAndDigits(s);
    
    int dividend = 20;
    int divisor = 3 ;
    getQuotient(dividend,divisor);
    
    
    if((detectedHit(20,100,30)== true)){
     System.out.println("HIT"); 
      
    }else{
     System.out.println("MISS");
     
    }
     
    if((detectedHit(100,105,30))== true ){
     System.out.println("HIT");  
      
      
    }else{
      System.out.println("MISS"); 
      
    }
    
  }
  
  
  public static void myName() {  //REQUIRED
    
    System.out.println("David Cabrera Cepeda");
    //print you name, call this method in "main"
    
  }// end myName
  
  
  //(20 pts)
  public static void dressDecision(Color choiceOne, Color choiceTwo,int dressSize) {
    int min = 6;
    int max = 10;
    
    if((choiceOne == Color.RED &&(dressSize>=6 &&dressSize<= 10 )) || (choiceTwo == Color.RED &&(dressSize>=6 &&dressSize<= 10 ))){
      System.out.println("BUY");
      
    }else
      System.out.println("Pass");
    
    //print "BUY" or "PASS" depending if at least one Color choice is Color.RED
    //and the dress size is between 6 - 10
    //call this method in "main"
    
  }
  
  //(20 pts)
  public static int median(int x, int y, int z) {
    
    
    if(x < y && x > z){
      
      
    }
    return x;
    
    //use NESTED if-else statements to return the middle value from the set of parameters {x, y, z}
    //call the method in "main" using median(8, 9, 2) for values 
    
      //must change this to be value of the median 
    
  }
  
  //(20 pts)
  public static void countLettersAndDigits(String s) {
    
    int count = 0;
    
    for(int i = 0; i < s.length() ; i++){
      char c = s.charAt(i);
      
      if(Character.isDigit(c)||(Character.isLetter(c))||(Character.isWhitespace(c)) ){
       count = count + 1;  
      }
      
      
    }
    System.out.println(count + " Digits in " + s);
    
    
    //accumulate  a value for numberOfDigits, numberLetters, and otherChars in the processing loop.
    //write a  method that processes some text using  Character  and String class methods/utilities and   
    //print both accumulators 
    //You can Google the Character class to see its methods.
    //call this method in "main" with the String
    // "99BottleOfBierOnTheWall99BotlesOfBier,TakeOneDownPassItAround,98BottlesOfBierOnTheWall"
  } 
  
  public static int getQuotient(int dividend, int divisor){
    
    return dividend / divisor;
    
    
    //(20 pts)
    //write a method named getQuotient(int dividend, int divisor) that RETURNS the quotient of its parameters
    //call this method in "main" with the arguments (20, 3).
    //HERE you must write the method SIGNATURE
    
    
  }
  
  
  
  //(20 pts)
  //USING THE following method:
  public static boolean detectedHit(int enemyX, int missileX, int missileY) {
    
    final int ENEMY_Y = 40;
    final int ENEMY_SIZE = 20;
    
    if( (enemyX <= missileX  &&  missileX <= enemyX + ENEMY_SIZE)  && 
       (ENEMY_Y <= missileY  &&  missileY <= ENEMY_Y + ENEMY_SIZE) ){
      
      return true;
      
    }else{
      
      return false;
    
    }
    
     
     
  }
  
  //call detectedHit from main with (20, 100, 30) and (100, 105, 30)
  //use an if-else statement to print "MISS" or "HIT" depending if true or false is returned
  
  
} //end CS1063ExamTwo
