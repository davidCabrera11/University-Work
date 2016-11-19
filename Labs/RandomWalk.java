import java.awt.*;
import java.util.*;
public class RandomWalk { 

  public static final Scanner CONSOLE = new Scanner(System.in);
  public static void main(String[] args){
    System.out.println("Lab 7 written by Pedro Garcia");
 
    DrawingPanel panel = new DrawingPanel(900, 900);
    Graphics g = panel.getGraphics();
    Random randomObject = new Random();
    int x = 450;
    int y = 450;
    int z = 450;
    int w = 450;
   //This is where you input the color of your walk
    String c1 = "RED";
    String c2 = "ORANGE";
    System.out.println("Enter the color of your walk. (Red or Orange):");
    String wChoice = CONSOLE.next();
    String walChoice = wChoice.toUpperCase();
    while (! (((matchChoice(walChoice, c1)) == true) || ((matchChoice(walChoice, c2)) == true))) {
      System.out.println("Incorrect entry. Enter the color of your walk. (Red or Orange):");
      wChoice = CONSOLE.next();
      walChoice = wChoice.toUpperCase();
    }
    System.out.println("Your walk color is " + walChoice);
    // This is where you input the color of your circle
    String choice3 = "BLUE";
    String choice4 = "GREEN";
    System.out.println("Enter the color of your circle. (Blue or Green):");
    String cChoice = CONSOLE.next();
    String cirChoice = cChoice.toUpperCase();
    while (! (((matchChoice(cirChoice, choice3)) == true) || ((matchChoice(cirChoice, choice4)) == true))) {
      System.out.println("Incorrect entry. Enter the color of your circle. (Blue or Green):");
      cChoice = CONSOLE.next();
      cirChoice = cChoice.toUpperCase();
    }
    System.out.println("Your circle color is " + cirChoice);
    System.out.println("Enter an integer radius for your circle.(Between 50 and 400) :");
    int rad = CONSOLE.nextInt();
   
    // This method decides if the circle gets drawn and draws it within the circle
    while (! ((rad >= 50) && (rad <= 400))){
      System.out.println("Incorrect entry. Enter and integer radius for your circle.(Between 50 and 400) :");
      rad = CONSOLE.nextInt();
    }
    System.out.println("The radius of your circle is " + rad);
    int corX = 450 - rad ;
    int corY = 450 - rad ;
    if (cirChoice.equals("BLUE")) {
      g.setColor(Color.BLUE);
      g.drawOval(corX, corY, rad * 2, rad * 2);
    }
    else {
      g.setColor(Color.GREEN);
      g.drawOval(corX, corY, rad * 2, rad * 2);
    }
   
    //The method prints the steps and step counts depending on the color choice
    if (walChoice.equals("RED")) {
      int count = 0;
      g.setColor(Color.RED);
      panel.sleep(2);
      g.drawLine(x, y, z, w);
      double dist = Math.sqrt(Math.pow((x - z), 2) + Math.pow((y - w), 2));
      while (dist <= rad) {
        int step = randomObject.nextInt(4);
        if (step == 0) {
          z = z - 1;
        }
        else if (step == 1) {
          z = z + 1;
        }
        else if (step == 2) {
          w = w - 1;
        }
        else if (step == 3) {
          w = w + 1;
        }
        g.drawLine(x, y, z, w);
        dist = Math.sqrt(Math.pow((x - z), 2) + Math.pow((y - w), 2));
        count++;
      }
      System.out.println("You stepped " + count + " times.");
    }
    else {
      int count = 0;
      g.setColor(Color.ORANGE);
      panel.sleep(1);
      g.drawLine(x, y, z, w);
      double dist = Math.sqrt(Math.pow((x - z), 2) + Math.pow((y - w), 2));
      while (dist <= rad) {
        int step = randomObject.nextInt(4);
        if (step == 0) {
          z = z - 1;
        }
        else if (step == 1) {
          z = z + 1;
        }
        else if (step == 2) {
          w = w - 1;
        }
        else if (step == 3) {
          w = w + 1;
        }
        g.drawLine(x, y, z, w);
        dist = Math.sqrt(Math.pow((x - z), 2) + Math.pow((y - w), 2));
        count++;
      }
      System.out.println("You stepped " + count + " times.");
    }
  }
  // This method makes sure the correct color choices are made.
  public static boolean matchChoice(String answer, String choice) {
    if (((answer.startsWith((choice.substring(0, 1)))) && (answer.endsWith((choice.substring(0, 1)))))
          || ((answer.startsWith(choice)) && (answer.endsWith(choice))))
      return true;
    else {
      return false;
    }
  }
}