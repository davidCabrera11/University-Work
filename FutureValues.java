import java.text.*;
import java.util.*;

public class FutureValues {
/* This program calculates the values of futures compound interest and the value annuity
 * 
 *Using parameters that are user input variables to then return and print the final value
 * 
 */ 
  
  public static final Scanner reader = new Scanner(System.in); 
  public static void main(String[] args) { 
    
    System.out.println("Lab 3 written by: David Cabrera ");
    
    System.out.println();
  
    // Calling Compund Future Value METHOD
  
    System.out.println("Enter present value");
    double pValue = reader.nextDouble();
    
    System.out.println("Enter interest rate");
    double iRate = reader.nextDouble();
    
    System.out.println("Enter number of years");
    double numbYears = reader.nextDouble();
    
    double fValue = accountValue(pValue,iRate,numbYears);
    
    System.out.println("Future interest of Compound Interest is : " + moneyString(fValue));
    
    System.out.println("\n");
    
    // Calling Annuity Future Value METHOD
    
    
    System.out.println("Enter Yearly Payment");
    double yearPay = reader.nextDouble();
    
    System.out.println("Enter interest rate");
    double rateInterest = reader.nextDouble();
    
    System.out.println("Enter number of years");
    double nofYears = reader.nextDouble();
    
    
    double fvAnnuity = annuityValue(yearPay,rateInterest,nofYears);
    
    System.out.println("Future value of Annuity is : " +  moneyString(fvAnnuity));
    
    System.out.println("\n");
  }
  
  //Method calls on 3 paramters for calculating the compound interest c
  public static double accountValue(double p,double r,double y){
    
    double value = p*Math.pow((1 + r / 100),y);
    
    return value;
    
  }
  
  //Method calls on 3 paramters for calculating the final value of annuity
  public static double annuityValue(double yp,double ir,double ny){
    
    double annuityFinal = yp*(Math.pow((1 + ir / 100),ny)-1)/(ir/100);
    
    return annuityFinal;  
  }
 
  public static String moneyString(double amount) {
    DecimalFormat dollarsAndCents = new DecimalFormat("$#0.00");
    return dollarsAndCents.format(amount);
  }
  
}
