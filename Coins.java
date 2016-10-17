import java.util.*;
public class Coins {
  public static final Scanner console = new Scanner(System.in);
  /* This program calculates the amount of quarters , dimes, nickels and pennies from user input
   * and outputs the total in dollars.
   * Also calculates the total number of quarters, dimes, nickels and pennies needed to add up to the 
   * cents that are from user input.
   */
  public static void main(String[] args) { 
    System.out.println("Lab 2 written by David Cabrera Cepeda");
    System.out.println();
    
    totalvalueDollar();
    centaddUp();
  }
  
  /*
   * This method prints out the total number of coins and their value in dollars
   */ 
  public static void totalvalueDollar(){
    
    int quartTotal,dimTotal,nickTotal,penTotal,coinTotal;
    double tot;
    
    // 
    System.out.println("Enter the number of quarters: ");
    quartTotal = console.nextInt();
    double amount = quartTotal * 0.25;
    
    //
    System.out.println("Enter the number of dimes: ");
    dimTotal = console.nextInt();
    double amount1 = dimTotal * 0.1;
    
    //
    System.out.println("Enter the number of nickels: ");
    nickTotal = console.nextInt();
    double amount2 = nickTotal * 0.05;
    
    //   
    System.out.println("Enter the number of pennies: ");
    penTotal = console.nextInt();
    double amount3 = penTotal * 0.01;
    
    //
    
    System.out.println( quartTotal +" Quarters is " + amount + " cents");
    System.out.println( dimTotal +" Dimes is " + amount1 + " cents");
    System.out.println( nickTotal +" Nickels is " + amount2 + " cents"); 
    System.out.println( penTotal +" Pennies is " + amount3 + " cents");
    
    tot =  amount +  amount1 + amount2 + amount3;
    System.out.println("The total amount in dollars is :" + tot+"\n");
    
  }
  
  /*
   * This method determines and prints out the number of quarters,dimes,nickels and pennnies 
   * to add up to the number of cents.
   */
  public static void centaddUp(){
    
    int centsTotal,remainderCents,remainderQuarter,remainderDime;
    int remainderNickel,remainderPenny,remainderTemp;
    
    System.out.println("Enter the number of cents:");
    
    centsTotal = console.nextInt();
    
    remainderCents = centsTotal%25;
    //
    remainderQuarter = centsTotal / 25;
    //
    remainderDime = remainderCents / 10;
    //
    remainderTemp = remainderCents %10;
    //
    remainderNickel = remainderTemp / 5;
    //
    remainderPenny = remainderTemp % 5;
    
    
    System.out.println("\nNumber of Quarters: " + remainderQuarter);
    
    System.out.println("Number of Dimes: " + remainderDime);
    
    System.out.println("Number of Nickels: " + remainderNickel);
    
    System.out.println("Number of Pennies: " + remainderPenny);
    
    System.out.println("Add up to " + centsTotal + " cents");
    
    
  }
}




