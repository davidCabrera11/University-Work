/**
 * This Program prints the first verse of "Mary had a little lamb" and the first 3 verses of "The old man" 
 * by creating several methods to call between them.
 */
public class Poems {
  
  
  public static void main(String[] args) { 
    
    System.out.println("Lab 1 written by David Cabrera Cepeda");
    System.out.println();
    
    marylittleLamb();
    
    System.out.println();
    
    oldMan();
  }
  
  // First Poem Marry had a little lamb
  
  public static void marylittleLamb(  ){
    
    System.out.println("'Marry Had a Little Lamb'");
    System.out.println();
    
    maryRefrain();
    marysecondLine();
    maryRefrain();
    marylastLine();
    
  }
  
  //method to print the refrain of the poem 
  public static void maryRefrain( ){
    System.out.println("Mary had a little lamb,");
  }
  //Prints the second line of poem
  public static void marysecondLine( ){
    System.out.println("Little lamb,little lamb,");
  }
  
  //Prints the final line of the poem
  public static void marylastLine( ){
    System.out.println("Its fleece was white as snow");
    
  }
  
  //Start of Second Poem "This Old Man".
  
  public static void oldMan() {
    
    System.out.println("'This Old Man'");
    System.out.println();
    
    firstVerse();
    System.out.println();
    secondVerse();
    System.out.println();
    thirdVerse();
  }
  //Prints the refrain of the Old Man Poem
  public static void refrainoldMan(){
    System.out.println("With a knick-knack patty-whack, give a dog a bone \nThis old man came rolling home");
  }
  
  // FIRST VERSE
  
  public static void firstVerse(){  
    firstLine();
    secondLine();
    refrainoldMan();
  }
  public static void firstLine(){
    System.out.println("This old man, he played one");
  }
  public static void secondLine(){
    System.out.println("He played knick-knack on my thumb");
  }
  
  //SECOND VERSE
  
  public static void secondVerse(){
    
    firstlinesecondVerse();
    secondlinesecondVerse();
    refrainoldMan();
  }
  public static void firstlinesecondVerse(){
    System.out.println("This old man, he played two");
  }
  public static void secondlinesecondVerse(){
    System.out.println("He played knick-knack on my shoe");
  }
  
  //THIRD VERSE
  
  public static void thirdVerse(){
    
    firstlinethirdVerse();
    secondlinethirdVerse();  
    refrainoldMan();
  }
  public static void firstlinethirdVerse(){
    System.out.println("This old man, he played three");
  }
  public static void secondlinethirdVerse(){
    System.out.println("He played knick-knack on my knee");
  }
}

