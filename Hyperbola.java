import java.awt.*;
public class Hyperbola {
  
  
  // Program prints out a Hyperbola by using the graphics library
  public static final int panel_size = 512;
  
  public static void main(String[] args) { 
    System.out.println("Lab 4 written by David Cabrera Cepeda"); 
    
    DrawingPanel panel = new DrawingPanel(panel_size,panel_size);
    Graphics g = panel.getGraphics();
    
    
    for(int a = 0; a <= panel_size; a +=32){
      g.drawLine(0, a, a, 512);
      
    }
    
    
    for(int b = panel_size; b >= 0; b -=8){
      g.drawLine(panel_size,b ,b, 0);
      
      
      
    }
    
    
  }   
}
