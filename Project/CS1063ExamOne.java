public class CS1063ExamOne {
  
  /*
   CS1063  Fall 2016 Exam One.   Total pts: 100
   
   You may use books, notes, example code, etc.
   
   Type of Problems:
   
   1) write a method named "myName()" that prints your name.                  (10 pts)
   
   2) write a method named "numericExpression()" that computes the following expression and prints its result:
   //all on a single line
   //add numbers 1 ... 10. divide this sum by 3 to create a quotient using integer division, 
   //then compute modulo (remainder) 7 of this quotient
   //print the final number only                                           (20 pts)
   
   3) write a method named "xGraphic()" that prints a "X" character pattern.(lab 0) 5 long wide  (25 pts)
   
   4) write a method named "squareOfNumbersOneToFive()" that uses a loop to calculate and print the
   square of numbers 1 ... 5. Print the each number on the same line. Each number is spaced by the 
   '\t' control character.                                                 (20 pts)
   
   5) write a method named "divisionTable()" that prints the quotient of all number combinations
   from 1 .. 10 using NESTED loops. The table has 10 rows and 10 columns. Each row is separated
   by a newline. Each column is separated by the '\t' control character.   (25 pts)
   
   The test is representative of the lab assignments, lab0, lab1, lab2. 
   Don't forget using REMAINDER and INTEGER DIVISION that was in lab2.  
   The test also reflects the interactive assignments we have been doing in class.
   
   
   CALL EACH METHOD from main(). Follow each method call with a newline.
   */
  
  public static void main(String[] args) {
    
    myName();
    System.out.println();
    numericExpression();
    System.out.println();
    xGraphic();
    System.out.println();
    squareOfNumbersOneToFive();
    System.out.println("\n");
    divisionTable();
  }
  
  
  public static void myName() {
    
    System.out.println("David Cabrera Cepeda");
    
  }// end myName
  
  
  public static void numericExpression(){
    
    int a =(1+2+3+4+5+6+7+8+9+10)/3%7;    
    System.out.println(a);
    
  }
  
  
  public static void xGraphic() {
    System.out.println("xxx         xxx");
    System.out.println(" xx         xx ");
    System.out.println("  xx       xx  ");
    System.out.println("     xxxx      ");
    System.out.println("  xx       xx  ");
    System.out.println(" xx         xx ");
    System.out.println("xxx         xxx");
    
  }
  
  
  
  public static void squareOfNumbersOneToFive(){
    for(int i =1 ;i<=5;i++ ){
      System.out.print(" "+i*i+"\t");
      
    }
    System.out.println();
  }
  
  
  
  public static void divisionTable(){
   
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <=10; j++) {
        System.out.print(i/j + "\t");
      }
      System.out.println("\n");
    }
    
    
    
  }
  
  
} //end CS1063ExamOne