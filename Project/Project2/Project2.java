/* This program is a simple version of the Space Invaders game  
 * Using the DrawingPanel class to output the game in different window
 */
import java.awt.*;
public class Project2{
  
  public static final int ENEMY_Y = 20;
  public static final int ENEMY_SIZE = 30;
  public static final int PATROL_Y = 250;
  public static final int PATROL_SIZE = 20;
  public static final int PATROL_MISSILE_LENGTH = 10;
  public static int patrolX = 270;
  public static int enemyX = 0;
  public static int RIGHT_ARROW = 39;
  public static int LEFT_ARROW = 37;
  public static int UP_ARROW = 38;
  public static int  patrolMissileX;
  public static int patrolMissileY = 0;
  public static boolean hit = false;
  
  public static void main(String[] args) {
    
    String authorName = "Project 2 written by David Cabrera Cepeda";
    
    DrawingPanel panel = new DrawingPanel(300, 300);
    Graphics g = panel.getGraphics( );
    g.drawString(authorName,10,15);
    
    startGame(panel, g);
    
  }
  // This method starts the game calling other methods that establish the parameters of the game
  public static void startGame(DrawingPanel panel, Graphics g) {
    
    
    int x = 0;
    int y = 270;
    int deltaX = 1;
    int deltaY = -3;
    drawPatrol(g, Color.GREEN);   
    for (int time = 0; time <= 1000; time ++) {
      moveEnemyShipAndDraw(panel,g); 
      movePatrolMissleAndDraw(g);
      handleKeys(panel,g);
      panel.sleep(50);
      detectHit();
      
    }
  }
  // Method draws the users green square
  public static void drawPatrol(Graphics g, Color c){    
    g.setColor(c);
    g.fillRect(patrolX, PATROL_Y,PATROL_SIZE,PATROL_SIZE);  
    
  }    
  /* Method that moves the red square that moves horizontally 
   * Also prints out a message if the ship was i=hit or got away
   */
  public static void moveEnemyShipAndDraw(DrawingPanel panel,Graphics g){
   
    g.setColor(Color.WHITE); 
    g.fillRect(enemyX, ENEMY_Y, ENEMY_SIZE, ENEMY_SIZE);
    enemyX ++;
    g.setColor(Color.RED); 
    g.fillRect(enemyX, ENEMY_Y, ENEMY_SIZE, ENEMY_SIZE); 
    
    
    
    String hitEnemy = "Enemy ship hit!";
    String gotAway = " Enemy ship got away !";
    
    if( detectHit() == true  ){
      
      g.setColor(Color.GREEN);
      g.drawString(hitEnemy, 1,290);
      
     
      g.setColor(Color.BLACK);
      g.fillRect(enemyX, ENEMY_Y, ENEMY_SIZE, ENEMY_SIZE);
      enemyX = 0 ;
      
      
      //THIS PART OF CODE CAN BE GREATLY IMPROVED !!!!!!!!!!!!!!
      for(int ENEMY_Y = -200;ENEMY_Y <350; ENEMY_Y--){
      g.setColor(Color.BLACK);
      g.fillRect(enemyX, ENEMY_Y, ENEMY_SIZE, ENEMY_SIZE);
      
      }
      
    }else if(detectHit() == false){ 
      
      if(enemyX > 300){
        g.setColor(Color.RED);
        g.drawString(gotAway,1,290);
      
      }
      
    }
    
    
  }
  
  /*Method allows for program to take in key input of Right, Left and Up arrows
   * 
   * 
   */ 
  public static void handleKeys(DrawingPanel panel, Graphics g) {
    int i = panel.getKeyCode();
    int counter = 1;
    if (i == RIGHT_ARROW  && patrolX <=280) {      
      g.setColor(Color.WHITE);
      g.fillRect(patrolX,PATROL_Y,PATROL_SIZE,PATROL_SIZE);  
      patrolX += 3;
      g.setColor(Color.GREEN); 
      g.fillRect(patrolX, PATROL_Y, PATROL_SIZE, PATROL_SIZE);
    }
    else  if (i == LEFT_ARROW && patrolX >0){      
      g.setColor(Color.WHITE);
      g.fillRect(patrolX,PATROL_Y,PATROL_SIZE,PATROL_SIZE);  
      patrolX -= 3;
      g.setColor(Color.GREEN); 
      g.fillRect(patrolX, PATROL_Y, PATROL_SIZE, PATROL_SIZE);
    }
    else if (i == UP_ARROW && patrolMissileY <= 0){
      // sets the position in which the "missile" will exit the green square
      patrolMissileY = PATROL_Y -1 ;
      patrolMissileX =  patrolX + (PATROL_SIZE / 2);
      
    }
  }
  
  /*
   * Method draws the missile by pressing the UP arrow
   * 
   */ 
  public static void movePatrolMissleAndDraw(Graphics g){
    
    if(PATROL_Y > 0 ) {
      g.setColor(Color.WHITE); 
      g.fillRect(patrolMissileX ,  patrolMissileY, 1, 10);
      patrolMissileY -= 5; 
      g.setColor(Color.BLACK); 
      g.fillRect(patrolMissileX, patrolMissileY, 1,  PATROL_MISSILE_LENGTH);   
    }
    
    
  }
  
  /*
   * Method detects whether or not the red square(enemy) has been hit and returns a boolean 
   */ 
  public static boolean detectHit(){  
    
    if( (enemyX <= patrolMissileX  &&  patrolMissileX <= enemyX + ENEMY_SIZE)  && 
       (ENEMY_Y <= patrolMissileY  &&  patrolMissileY <= ENEMY_Y + ENEMY_SIZE)){
      
      return true;
      
    }else {
      
      return false; 
      
    }
    
  }   
  
}






