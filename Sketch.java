import processing.core.PApplet;

public class Sketch extends PApplet {
  double[][] square;
  int CELL_WIDTH;
  int CELL_HEIGHT;
  int MARGIN = 10;
  int ROW_COUNT = 10;
  int COLUMN_COUNT = 10;
  int SCREEN_WIDTH;
  int SCREEN_HEIGHT;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(500, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0,0,0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	
square = new double[10][20];

fill(255);
for(int i = 0; i <= 10;i++ ){
rect(MARGIN+i*45,0,37,37);
}
for(int i = 0; i <= 10;i++ ){
  if(i==6){
    fill(0,255,0);
rect(MARGIN+i*45,40,37,37);
  }
else{
  fill(255);
rect(MARGIN+i*45,40,37,37);
  }
}


for(int i = 0; i <= 10;i++ ){
rect(MARGIN+i*45,80,37,37);
}
for(int i = 0; i <= 10;i++ ){
rect(MARGIN+i*45,120,37,37);
}
for(int i = 0; i <= 10;i++ ){
rect(MARGIN+i*45,160,37,37);
}
for(int i = 0; i <= 10;i++ ){
  rect(MARGIN+i*45,200,37,37);
  }
  for(int i = 0; i <= 10;i++ ){
  rect(MARGIN+i*45,240,37,37);
  }
  for(int i = 0; i <= 10;i++ ){
  rect(MARGIN+i*45,280,37,37);
  }
  for(int i = 0; i <= 10;i++ ){
    rect(MARGIN+i*45,320,37,37);
    }
    for(int i = 0; i <= 10;i++ ){
    rect(MARGIN+i*45,360,37,37);
    }
    
  }


  public void mousePressed(){
    
  }
}