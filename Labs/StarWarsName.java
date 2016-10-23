import java.util.*;
public class StarWarsName {
  
  public static final Scanner reader = new Scanner(System.in);
  
//Program obtains user input to then be changed to print out their Starwars Name  

  public static void main(String[] args) { 
    
    System.out.println("Lab 4 written by David Cabrera Cepeda\n"); 
    System.out.println("Star Wars Name Generator\n");
    
    String firstName,lastName,maiden,city,firstCar;
    
    firstName = promptString("Enter your first name: ");
    
    lastName = promptString("Enter your last name: ");
    
    maiden = promptString("Enter your mothers maiden name: ");
    
    city = promptString("Enter the city where you were born: ");
    
    firstCar = promptString("Enter the first car your drove: ");
    
    // Obtaining character parameters  from each string inputted by the user
    
    String starwarsFirst = (firstName.substring(0,3) + lastName.substring(0,2)).toUpperCase();
    
    String starwarsLast = (maiden.substring(0,2) + city.substring(0,3)).toUpperCase();
    
    String starwarsPlanet =(lastName.substring(lastName.length() - 2 , lastName.length()) + firstCar).toUpperCase();
    
    
    System.out.println("You are " + starwarsFirst + " "+ starwarsLast +" of " + starwarsPlanet);
  }
  
  //Creates a temporal variable to return the Strings inputted above without any spaces
  
  public static String promptString(String f){
    
    System.out.println(f);
    
    return reader.nextLine().trim();
    
  }
}
