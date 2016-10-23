import java.util.*;
import java.awt.*;

public class Circles {
  
  public static final Scanner reader = new Scanner(System.in);
  public static void main(String[] args) { 
    
    System.out.println("Lab 5 written by David Cabrera Cepeda \n"); 
    
    DrawingPanel panel = new DrawingPanel(400,300);
    Graphics g = panel.getGraphics();
    
    
    //Circle 1
    System.out.println("Enter the X co-ordinate of the #1 Circle: ");
    int a_X = reader.nextInt();
    
    System.out.println("Enter the Y co-ordinate of the #1 Circle: ");
    int a_Y = reader.nextInt();
    
    System.out.println("Enter the radius of the #1 Circle: ");
    int a = reader.nextInt();
    
    //Circle 2
    System.out.println("\nEnter the X co-ordinate of the #2 Circle: ");
    int b_X = reader.nextInt();
    
    System.out.println("Enter the Y co-ordinate of the #2 Circle: ");
    int b_Y = reader.nextInt();
    
    System.out.println("Enter the radius of the #2 Circle: ");
    int b = reader.nextInt();
    
    //Circle 3
    System.out.println("\nEnter the X co-ordinate of the #3 Circle: ");
    int c_X = reader.nextInt();
    
    System.out.println("Enter the Y co-ordinate of the #3 Circle: ");
    int c_Y = reader.nextInt();
    
    System.out.println("Enter the radius of the #3 Circle: ");
    int c = reader.nextInt();
    
    
    g.setColor(Color.RED);
    g.fillOval(a_X,a_Y,a*2,a*2);
    
    g.setColor(Color.BLUE);
    g.fillOval(b_X,b_Y,b*2,b*2);
    
    g.setColor(Color.GREEN);
    g.fillOval(c_X,c_Y,c*2,c*2);
    
    
    // First Circle compared to Second Circle
    
    
    if((circleSize( a ,  b))== 0){
      System.out.println("Red and Blue Circle are the same size");
      
    }else if ((circleSize( a ,  b))== 1){
      System.out.println("Red Circle is bigger than Blue Circle");
      
      
    }else if((circleSize( a ,  b))== -1){
      System.out.println("Red Circle is smaller than the Blue Circle");
      
    }
    
    //Second Circle compared to Third Circle
    
    
    if((circleSize( b ,  c))== 0){
      System.out.println("Blue Circle and Green Circle are the same size");
      
    }else if ((circleSize( b ,  c))== 1){
      System.out.println("Blue Circle is bigger than Green Circle");
      
      
    }else if((circleSize( b ,  c))== -1){
      System.out.println("Blue Circle is smaller than the Green Circle");
      
    }
    // Third Circle Compared to First Cirle
    
    
    if((circleSize(  c,  a)) == 0){
      System.out.println("Green Circle and Red Circle are the same size");
      
    }else if((circleSize( c ,  a)) == 1){
      System.out.println("Green Circle is bigger than Red Circle");
      
      
    }else if((circleSize( c,  a)) == -1){
      System.out.println("Green Circle is smaller than the Red Circle");
      
    }
    
    System.out.println();
    

     //
    
    if (circleIntersect(a_X, a_Y, a, b_X, b_Y, b)== 1){
      System.out.println("Red Circle Intersects with Blue Circle"); 
      
      
    }else if (circleIntersect(a_X, a_Y, a, b_X, b_Y, b)== 0){
      System.out.println("Red Circle does not Intersect with Blue Circle");
      
      
    }
    
    //
    if (circleIntersect(b_X, b_Y, b , c_X, c_Y, c)==1){
      System.out.println("Blue Circle Intersects with Green Circle"); 
      
      
    }else if(circleIntersect(b_X, b_Y, b ,c_X, c_Y, c)==0){
      System.out.println("Blue Circle does not Intersect with Green Circle"); 
      
    }
    
    //
    if (circleIntersect(c_X, c_Y, c , a_X, a_Y, a)==1){
      System.out.println("Green Circle Intersects with Red Circle");
      
      
    }else if (circleIntersect(c_X, c_Y, c , a_X, a_Y, a)==0){
      System.out.println("Green Circle does not Intersect with Red Circle");
      
    }
    
    
  }
  
  //Method to compare Circle Sizes
  public static Integer circleSize(int r1, int r2){
    
    if(r1 == r2 ){
      return(0);
      
    }else if (r1 > r2){
      return(1);
      
    }else  {
      return(-1); 
      
      
    }
    
  } 
  
  public static Integer circleIntersect(int x1,int y1, int r1, int x2,int y2, int r2){
    
    double a = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));
    double b = r1 + r2 ;
    
    if(a <= b){
      return(1);
      
      
    }else {
      
      return (0); 
    }
   
    
  }
  
  
}





